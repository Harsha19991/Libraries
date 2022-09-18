def Download(repo)
{
  git "${repo}"
}
def Maven()
{
  sh 'mvn package'
}
