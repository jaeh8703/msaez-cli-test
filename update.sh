while :
do
  git checkout template 
  git pull
  git checkout main
  git merge template 
done
