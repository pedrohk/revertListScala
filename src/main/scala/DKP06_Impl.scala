object DKP06_Impl {
  def revert[A](list: List[A]): List[A] = {
    (0 until list.length).map(i => list(list.length - 1 - i)).toList
  }
}
