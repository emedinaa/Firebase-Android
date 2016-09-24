## Firebase Crash Reporting Android
Firebase examples for Android

1. Firebase console https://console.firebase.google.com/
2. Create new Project 
3. Select the DEVELOP option and then the 'Crash' 
4. Add Firebase to aplication of Android
	- Package name "com.emedina.firebaseexamples"
5. Download google-services.json file
6. Create new Android Project
7. Add dependencies to build.gradle of project and android App

	- build.gradle project
	```
	buildscript {
  		dependencies {
    	// Add this line
    		classpath 'com.google.gms:google-services:3.0.0'
  		}
	}
	```

	- build.gradle app
	
	```
		//https://firebase.google.com/docs/crash/android
		compile 'com.google.firebase:firebase-crash:9.6.0'
		
		//SDK 23 and gradle 2.1.x use version firebase-crash:9.2.0
		 compile 'com.google.firebase:firebase-crash:9.2.0'
	```

	```...
		// Add to the bottom of the file
		apply plugin: 'com.google.gms.google-services'

	```
8. Copy google-service.json file in app folder and sync project.
9. Generating an error in App and check the firebase console 

  <img src="https://github.com/emedinaa/Firebase-Android/blob/master/crash/screenshot.png" height="480">
  
References:
	
- Firebase Crash [https://firebase.google.com/docs/crash/](https://firebase.google.com/docs/crash/)
	
- Github [https://github.com/firebase/quickstart-android](https://github.com/firebase/quickstart-android)
