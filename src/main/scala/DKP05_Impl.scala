object DKP05_Impl {
  def revert[A](list: List[A]): List[A] = {
    list.indices.map(i => list(list.length - 1 - i)).toList
  }
}