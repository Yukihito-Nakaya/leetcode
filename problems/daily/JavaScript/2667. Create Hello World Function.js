/**
 * @return {Function}
 */
var createHelloWorld = function() {
    return () => "Hello World";
    // return function() {
    //     return "Hello World"
    // }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */