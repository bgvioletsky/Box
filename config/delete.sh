API_URL="https://api.github.com/repos/$GITHUB_REPOSITORY/actions/workflows/$GITHUB_WORKFLOW.yml/runs"
# API_URL="https://api.github.com/repos/bgvioletsky/Box/actions/workflows/delete.yml/runs"

echo $API_URL
curl -s -L "$API_URL" > runs.json
runs=$(cat runs.json |jq -r '.workflow_runs[].id')
echo $runs
          # 将运行记录ID转换为数组
         IFS=$'\n' read -r -d '' -a run_ids <<< "$runs"
          
          # 计算需要删除的运行记录数量
          num_to_delete=$(( ${#run_ids[@]} ))
          
          # 删除超过20个的旧工作流运行记录
          if [ $num_to_delete -gt 0 ]; then
            for (( i=0; i<$num_to_delete; i++ )); do
              echo "Deleting run ID: ${run_ids[$i]}"
              curl -X DELETE -H "Authorization: token $GITHUB_TOKEN" -H "Accept: application/vnd.github.v3+json" "https://api.github.com/repos/$GITHUB_REPOSITORY/actions/runs/${run_ids[$i]}"
            done
          else
            echo "No runs to delete."
          fi
           