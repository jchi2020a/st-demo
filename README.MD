# Selenium demo for Sitetracker 

 Hi Team. As per your request, I have created a github repository where the assignment is contained. 

 Please note that in its current state, the automation script is incomplete, reason being that the application under test exhibits an erratic behavior when tested through selenium commands. 

 To be more specific, when selecting the table with Inline edit, the actual content of the table to be edited is not properly fetched. 

 **Steps to reproduce**

In order to replicate the aforesaid issue, execute the selenium code (the issue is only reproducible when the driver is programmatically driven), cd into the root folder (selenium-demo) and invoke the command below: 

`mvn clean test -Ddriver=firefox`

[visual cue](https://share.getcloudapp.com/geu2Bp8Z)

 **Expected behavior**

  Table is properly fetched. 

 **Actual behavior**

  Table is fetched twice. 

  