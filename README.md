## Abstract Class – Book
Represents books in general regardless of type.
It has one abstract method: describe() (must be implemented by subclasses)
One concrete method: read() (can be reused by subclasses)

## Interface – Genre
Defines one method: defineGenre()
any class that implements Genre must provide its own implementation.

## Concrete Classes – Fiction and NonFiction
Both of these extend the abstract Book class stated above.
Both also implement the Genre interface.

### the following methods represent:

describe() --> (how the book content is characterized)

defineGenre() --> (which genre the book belongs to)

## Main Class – BookGenreHierarchy
Creates objects of Fiction and NonFiction to help classify books.
