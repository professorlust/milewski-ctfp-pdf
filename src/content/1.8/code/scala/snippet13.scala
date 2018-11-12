def bimap: (FU[A] => FU[A|\textart{s}|]) =>
    (GU[B] => GU[B|\textart{s}|]) =>
    BiComp[BF, FU, GU, A, B] =>
    BiComp[BF, FU, GU, A|\textart{s}|, B|\textart{s}|]