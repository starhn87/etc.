document.addEventListener('DOMContentLoaded', () => {
    const index = new Index();
    index.init();
    console.log("hello world!!");
})

class Index {
    constructor() {
        alert("hello");
    }

    init() {
        alert("world!!");
    }
}