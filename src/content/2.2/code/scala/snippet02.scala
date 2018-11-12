def contramap[C, C|\textart{s}|, D[_]](f: C|\textart{s}| => C, u: C => Lim[D]): (C|\textart{s}| => Lim[D]) =
  u compose f