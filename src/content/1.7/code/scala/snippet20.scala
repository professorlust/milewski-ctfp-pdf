// using a Type Lambda
({type T[X] = Function1[A, X]})#T

// or with the Kind Projector plugin
Function1[A, ?] or A => ?