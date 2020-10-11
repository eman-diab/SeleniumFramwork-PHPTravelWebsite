# SeleniumFramwork-PHPTravelWebsite
Selenium Framwork using POM, DDT, Java, Maven, TestNG for test sign up function of PHPTravels website https://www.phptravels.net/ 

## The Project Components and How it Work?
I start Maven project that gives the structure, then add all dependencies need in the project like Selenium, TestNG and POI Apache.

I use POM that consider each web page of website as a class file. each class file will contain only corresponding web page elements.Using these elements,
can perform operations on the website under test.

I also use DDT to get valid and invalid input data for test cases.

## Features
1- POM help with easy maintenance of code and readability and reliability of script.
2- DDT allow to test the website with multiple sets of data values or with large volumes of random data.
3- TestNG can grouped and prioritize test cases more easily and gives the ability to produce HTML Reports.

## Limitations
1- using Thread.sleep() method insted of implicitly wait() becouse it dosen't work with me, that is bad practice in automation testing.


