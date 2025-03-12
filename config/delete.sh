API_URL="https://api.github.com/repos/$GITHUB_REPOSITORY/actions/workflows/148524231/runs"
response=$(curl -L -H "Accept: application/vnd.github+json" -H "Authorization: Bearer $GITHUB_TOKEN"  -H "X-GitHub-Api-Version: 2022-11-28" "$API_URL")

 
#  runs=$(curl -s -H "Authorization: token $GITHUB_TOKEN" -H "Accept: application/vnd.github.v3+json" "https://api.github.com/repos//actions/workflows//runs")
  echo $response
  # | jq -r '.workflow_runs[].id
          # 将运行记录ID转换为数组
#  IFS=$'\n' read -r -d '' -a run_ids <<< "$runs"
          
#           # 计算需要删除的运行记录数量
#           num_to_delete=$(( ${#run_ids[@]} - 5 ))
          
#           # 删除超过20个的旧工作流运行记录
#           if [ $num_to_delete -gt 0 ]; then
#             for (( i=0; i<$num_to_delete; i++ )); do
#               echo "Deleting run ID: ${run_ids[$i]}"
#               curl -X DELETE -H "Authorization: token $GITHUB_TOKEN" -H "Accept: application/vnd.github.v3+json" "https://api.github.com/repos/$GITHUB_REPOSITORY/actions/runs/${run_ids[$i]}"
#             done
#           else
#             echo "No runs to delete."
#           fi
           