#Exercise: Preparation and Initial Steps

##Content
In this exercise you will perform some general steps and settings. You will:
- fork the [`junit-course`](https://github.com/kotelisk/junit-course) project
- set some global system settings in your Jenkins server
- establish SSH connection between Jenkins and GitHub
- create a test job

##Step 1: Download Jenkins CI
- Download Jenkins Windows installer [`jenkins-ci Windows Installer`](http://gherkin.jenkins-ci.org/content/thank-you-downloading-windows-installer/)
- Start the installer

##Step 2: Proxy settings

- Change `Server` to `proxy`
- Set port to `8080`
- No proxy hosts: *.wdf.sap.corp, repo.maven.apache.org, github.com
- Press the button `Submit`
- Wait 15 secounds
- At the bottom of the page press the button `Check now`
- Later you can change those settings on the following way:
  - Navigate to `Manage Jenkins -> Manage Plugins`
  - Switch to tab `Advanced`
  - If you don't get an error, all is fine :-)
  
<img src="images/Jenkins_VM_Set_Proxy.png" width="500" />
  
##Step 3: Jenkins Startup And System Settings
- Through http://localhost:8080, you can access your jenkins server.
- Before you can use your Jenkins server further, you need to 'tell' Jenkins where to find Java and Maven:
- Visit http://localhost:8080 in a browser and navigate to `Manage Jenkins -> Configure System`

<img src="images/PathToManageJenkins.png" width="500" />

##Step 4: Configure Maven, Git and Github
N.B. - If you have never installed Maven on your computer now would be a good time to do so: [`Maven`](http://maven.apache.org/)

- In section `Maven`
  - Press the button `Add Maven`
  - Ensure that the box `Install automatically` is **not** checked
  - Define `maven` as `Name`
  - Define `<your_maven_home_folder>` as `MAVEN_HOME`

N.B. - If you have never installed Git on your computer now would be a good time to do so: [`Git`](https://git-scm.com/downloads); do the initial configuration [`Configure Git`](https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup)

- In section `Git plugin` maintain your:
 	- Global Config user.name Value	
 	- Global Config user.email Value

- Save your configuration

##Step 5: Establish SSH connection between Jenkins and GitHub
We need to add a private key to Jenkins in order to establish a secure connection to GitHub. 
- [`SSH Authentication between you machine and Github`](https://help.github.com/articles/generating-an-ssh-key/)

###Step 5.1: Set private key in Jenkins
- Navigate to the starting/ main page of your Jenkins Server
- Navigate to `Credentials`

<img src="images/PathToCreateCredentials.png" width="200" />

- Click on `Jenkins` (next to the house symbol, under "Stores scoped to Jenkins")
- Click on `Global credentials (unrestricted)`
- On the left side click on `Add Credentials`
- As `Kind` select `SSH Username with private key`
- Enter your d/i number as `Username`
- Select the radio button `From the Jenkins master ~/.ssh` in section `Private Key`
- Leave `Passphrase` empty, since we did not set a passphrase on key generation
- Enter `GitHub` as `Description`
- Press the button `OK`

##Step 6: Create Buletin board job
- Navigate to the root/main page of your Jenkins Server
- On the upper left corner of the screen, click on `New Item`

<img src="images/CreateNewJob.png" width="200" />

- Give the name `Buletin_Board` and select `Maven project`
- Press the button `OK`
- In field `Description` enter `This is my first Jenkins job`
- In section `Build` press the button `Add build step` and select `Execute shell`
- As `Command` enter the following statements to write 'Buletin Board is Up!' and the version number of the installed Cloud Foundry CLI into the console log.
```SHELL
echo Buletin Board is Up!
cf --version
```
- Save the job
- Run the job by clicking on `Build Now` on the left side of the window

<img src="images/RunJobManually.png" width="200" />

- Open the console log by clicking on the circle next to the job number and check what Jenkins has written into the console log. You should find - besides other lines - 'Buletin Board is Up!'.

<img src="images/OpenConsoleLog.png" width="300" />
