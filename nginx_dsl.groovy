pipelineJob("Build-Deploy") {
 definition {
  cpsScm{
 scm{
 git{

remote{

url("https://github.com/reshma910/jenkins.git")
credentials("")

}
branch('*/master')
}
}
scriptPath("Jenkins_ecr")
}

}

}