def Download(repo)
{
  git "${repo}"
}
def Maven()
{
  sh 'mvn package'
}
def Deploy()
{
  deploy adapters: [tomcat9(credentialsId: 'a78809e7-5c9e-44bd-9b0c-94964d56e9c7', path: '', url: 'http://172.31.43.181:8080')], contextPath: 'SIT', war: '**/*.war'
}
