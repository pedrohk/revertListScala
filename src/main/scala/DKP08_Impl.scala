object DKP08_Impl {
  def revert[A](list: List[A]): List[A] = {
    var result = List.empty[A]
    for i <- list do { result = i :: result }
    result
  }
}
