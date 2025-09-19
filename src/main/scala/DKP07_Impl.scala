object DKP07_Impl {
  def revert[A](list: List[A]): List[A] = {
    list.zipWithIndex.map((_, i) => list(list.length - 1 - i))
  }
}