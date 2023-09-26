def call(Map stageParams) {
 
 //   checkout([
//        $class: 'GitSCM',
 //       branches: [[name:  stageParams.branch ]],
 //       userRemoteConfigs: [[ url: stageParams.url ]]
   // ])

 checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs [[url: 'https://github.com/vamshikira/Java_app_3.0.git']])
  }






