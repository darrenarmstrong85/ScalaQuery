# ScalaQuery
Scala-Q GUI and possibly integration

Things I'd like to do with this project:

  - Make a decent GUI for local/remote kdb+ processes.

    - This should include connecting over ssh as current user
      i.e. JSch

    - Local processes should be easy to instantiate given a little
      configuration of 'QHOME'

  - Try to use Java library from code.kx.com, or similar, to be able
    to mix and match q and scala code.

    - It is my hunch that scala should fit very nicely around q code
      and vice-versa.

    - Does this one day mean making this into a fully-fledged Scala
      IDE?  Hmm that's a bit scary.