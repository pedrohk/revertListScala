object DKP10_Impl {
  def revert[A](list: List[A]): List[A] = {
    List.unfold(list) {
      case Nil => None
      case h :: t => Some((h, t))
    }.foldLeft(List.empty[A])((acc, x) => x :: acc)
  }
}
