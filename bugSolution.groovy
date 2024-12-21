```groovy
def someMethod(List<Integer> numbers) {
    if (numbers != null) {
        numbers.each { number ->
            println number * 2
        }
    } else {
        println "List is null"
    }
}

someMethod(null)
someMethod([1, 2, 3])
```