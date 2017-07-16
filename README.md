# Start-up Team-Tracker

#### _A Team Tracker Web Application for Epicodus Java Week 2 Independent Project, July 7, 2017_

#### By _**Lincoln Nguyen**_

## Description

A web application that allows any team leader to add their team name to the application and add their own team members. This application is to keep track of all teams and their members.

## Specifications

* Team user add team name.
  * _Example Input: Team Name: Epicodus_
  * _Example Output: "Your new team has been saved."_
* Team user add members to the team.
  * _Example Input: Member Name: Lincoln_
  * _Example Output: New member has been saved to team Epicodus_

  ## What's Included

```
startup-team-tracker
├── README.md
├── build.gradle
├── .gitignore
└── src
     ├── main
     │     ├── java
     │     │     ├── App.java
     │     │     ├── Member.java
     │     │     ├── Team.java
     │     │     └── VelocityTemplateEngine.java
     │     └── resources
     │             └── templates
     │                     ├── index.vtl
     │                     ├── layout.vtl
     │                     ├── members.vtl
     │                     ├── success.vtl
     │                     ├── team-form.vtl
     │                     ├── members-team-form.vtl
     │                     ├── members-team-success.vtl
     │                     ├── team-success.vtl
     │                     ├── team.vtl
     │                     └── teams.vtl
     |                     └── member.vtl
     └── test
           └── java
                 ├── MemberTest.java
                 └── TeamTest.java
```

## Setup/Installation Requirements

* User will need to download gradle on personal device
* $ git clone this respository to local drive
* $ gradle run
* Input localhost:4567 in a web browser

## Support and contact details

Email: huylincoln007@yahoo.com

## Technologies Used

* Java
* jUnit
* Gradle

### License

_Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE._

Copyright (c) 2017 **_Lincoln Nguyen_**
