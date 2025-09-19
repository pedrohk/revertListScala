object DKP02_Impl {
  def revert[A](list: List[A]): List[A] = {
    if list.isEmpty then list else revert(list.tail) :+ list.head
  }
}