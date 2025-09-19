object DKP03_Impl {
  def revert[A](list: List[A]): List[A] = {
    list.foldLeft(List.empty[A])((acc, x) => x :: acc)
  }
}
