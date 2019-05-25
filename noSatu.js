//Initiallising node modules
var express = require("express");
var bodyParser = require("body-parser");
var app = express(); 
var sql = require('mssql');

// Body Parser Middleware
app.use(bodyParser.json()); 

//CORS Middleware
app.use(function (req, res, next) {
    //Enabling CORS 
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, contentType,Content-Type, Accept, Authorization");
    next();
});

//Setting up server
 var server = app.listen(process.env.PORT || 8080, function () {
    var port = server.address().port;
    console.log("App now running on port", port);
 });
 var hobbies = ["Makan", "Main", "Tidur"];
   //GET API
app.get("/api/data", function(req , res){
    res.status(404).json({
        name: "Fauzan",
        address: "not found",
        hobbies: hobbies,
        is_married: false,
        school:[{
            highSchool: "SMA",
            university: "ITK"
        }],
        skills:[{
            Java: "70%",
            Python: "10%"
        }],


    })
});