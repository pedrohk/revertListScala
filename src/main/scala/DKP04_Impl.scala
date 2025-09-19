object DKP04_Impl {
  def revert[A](list: List[A]): List[A] = {
    def loop(rem: List[A], acc: List[A]): List[A] = {
      if rem.isEmpty then acc else loop(rem.tail, rem.head :: acc)
    }
    loop(list, Nil)
  }
}