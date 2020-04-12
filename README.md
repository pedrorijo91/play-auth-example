# play-auth-example

[![CircleCI](https://circleci.com/gh/pedrorijo91/play-auth-example.svg?style=svg&circle-token=fcdf8c2f28fab2f61cea558cada320ac14ac8e15)](https://circleci.com/gh/pedrorijo91/play-auth-example)

This repository is a working example for the Play Framework tutorial at [https://pedrorijo.com/blog/scala-play-auth/](https://pedrorijo.com/blog/scala-play-auth/).

To start the app just type:

```
$ sbt run
```

And open the homepage at [http://localhost:9000/](http://localhost:9000/).

You'll see listed several endpoints, each showing one of the concepts presented in the tutorial:

* Public Page
* Private Page using raw verification
* Private Page using Play helpers 
* Private Page using Custom Actions 
* Login
* Logout
* Login with incorrect username and/or password

This app has harcoded a single user: `user001` and password `pass001`. You can extend it by creating a registration form, or by simply adding more [hardcoded users on the UserDAO](https://github.com/pedrorijo91/play-auth-example/blob/master/app/models/UserDAO.scala#L10).
