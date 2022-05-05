package iterator

import org.junit.jupiter.api.Test

class IteratorTest {

    @Test
    fun displayNames() {
        val nameRepository = NameRepository()
        val iterator = nameRepository.getIterator()

        while (iterator.hasNext()){
            val name = iterator.next()
            println("Name : ${name}")
        }
    }

}