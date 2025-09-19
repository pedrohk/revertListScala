object DKP09_Impl {
  def revert[A](list: List[A]): List[A] = {
    list match {
      case Nil => Nil
      case head :: tail => revert(tail) ::: List(head)
    }
  }
}
