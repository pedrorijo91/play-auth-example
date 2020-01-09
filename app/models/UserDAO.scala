package models

import scala.collection.mutable

case class User(username: String, password: String)

object UserDAO {

  private val users = mutable.Map(
    "user001" -> User("user001", "pass001")
  )

  def getUser(username: String): Option[User] = {
    users.get(username)
  }

  def addUser(username: String, password: String): Option[User] = {
    if(users.contains(username)) {
      Option.empty
    } else {
      val user = User(username, password)
      users.put(username, user)
      Option(user)
    }
  }

}
