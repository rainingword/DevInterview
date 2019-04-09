// 考查理由：一个懂js程序员的基本功能之一是，要能对this关键字做出准确的判断
var marty = {
    firstName: "Marty",
    lastName: "McFly",
    timeTravel: function(year) {
        console.log(this.firstName + " " + this.lastName + " is time traveling to " + year);
    }
};

var getBackInTime = marty.timeTravel;

getBackInTime(2014); //打印结果是什么，为什么？