def f|\textart{s}|[A, B]: Option[A] => Option[B] = {
  case None => None
  case Some(x) => Some(f(x))
}