API_URL="https://api.github.com/repos/$GITHUB_REPOSITORY/actions/workflows/$GITHUB_WORKFLOW.yml/runs"
###
 # @Author: bgcode
 # @Date: 2025-03-12 16:16:18
 # @LastEditTime: 2025-03-12 17:20:16
 # @LastEditors: bgcode
 # @Description: 描述
 # @FilePath: /Box/config/delete.sh
 # 本项目采用GPL 许可证，欢迎任何人使用、修改和分发。
### 
# API_URL="https://api.github.com/repos/bgvioletsky/Box/actions/workflows/delete.yml/runs"

echo $API_URL
curl -s -L "$API_URL" > runs.json
runs=$(cat runs.json |jq -r '.workflow_runs[].id')
echo $runs
          # 将运行记录ID转换为数组
         IFS=$'\n' read -r -d '' -a run_ids <<< "$runs"
          
          # 计算需要删除的运行记录数量
          num_to_delete=$(( ${#run_ids[@]} - 5))
          
          # 删除超过20个的旧工作流运行记录
          if [ $num_to_delete -gt 0 ]; then
            for (( i=0; i<$num_to_delete; i++ )); do
              echo "Deleting run ID: ${run_ids[$i]}"
              curl -X DELETE -H "Authorization: token $GITHUB_TOKEN" -H "Accept: application/vnd.github.v3+json" "https://api.github.com/repos/$GITHUB_REPOSITORY/actions/runs/${run_ids[$i]}"
            done
          else
            echo "No runs to delete."
          fi
           