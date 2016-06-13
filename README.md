# GoogleAdMobIntegrationSample

https://console.firebase.google.com/project/project-2952911748916763421/overview


1. Provide your app name and create project
2. Place the google-services.json file in your app folder in the project
3. Add     classpath 'com.google.gms:google-services:3.0.0' in project level build.gradle under dependencies
4. Add apply plugin: 'com.google.gms.google-services' in app build.gradle file
   Add     compile 'com.google.firebase:firebase-ads:9.0.2' & 'com.google.firebase:firebase-core:9.0.2' in app build.gradle file under dependencies
5. Sync the project in android studio
6. If sync fails as unable to resolve firebase-core:9.0.2. Update the Google Play and Google Repository version from Android Sdk



Generate Ad-Unit for your application
---
https://support.google.com/admob/answer/3052638

https://apps.admob.com/

App Id and Ad Unit Id are required

##### TIPS:

Run the app
1.If your ad is not visible , remove all paddings and margins from the xml where you placed your adview and try.

2.To enable Test Ads,get the device id by
Run the app and observe following line in logcat
 Use `AdRequest.Builder.addTestDevice("XXXXXXX ... XXXXXXXXX")` to get test ads on this device.




