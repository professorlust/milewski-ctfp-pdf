implicit val treeFunctor = new Functor[Tree] {
  def fmap[A, B](f: A => B)(fa: Tree[A]): Tree[B] = fa match {
    case Leaf(a) => Leaf(f(a))
    case Node(t, t|\textart{s}|) => Node(fmap(f)(t), fmap(f)(t|\textart{s}|))
  }
}