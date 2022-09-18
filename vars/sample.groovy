def Download(repo)
{
  git "${repo}"
}
def Maven()
{
  sh 'maven package'
}
