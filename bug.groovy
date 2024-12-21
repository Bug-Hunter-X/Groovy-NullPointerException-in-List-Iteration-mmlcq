```groovy
def someMethod(List<Integer> numbers) {
    numbers.each { number ->
        println number * 2
    }
}

someMethod(null)
```