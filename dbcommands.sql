 db.employee.insertOne({})
{
        "acknowledged" : true,
        "insertedId" : ObjectId("625d3edd31d0accbf14fdf4e")
}
> db.employee.insertOne({name:"swa",dept:"devloper",location:"hyderbad"})
{
        "acknowledged" : true,
        "insertedId" : ObjectId("625d3f1e31d0accbf14fdf4f")
}
> show collections;
emdb.employee.insermany({name:"swa",dept:"devloper",location:banglore"}),({name:"gopi",dept:"automation",location:"chennai"})
 db.employee.insertOne({})
{
        "acknowledged" : true,
        "insertedId" : ObjectId("625d3edd31d0accbf14fdf4e")
}

show collections;
employee
> db.employee.find ({location :"banglore"})
{ "_id" : ObjectId("625d40b731d0accbf14fdf50"), "name" : "swa", "dept" : "devloper", "location" : "banglore" }
> db.employee.updateMany({name:"swa"},{$set:{name :"gopi"})
...
... s
... 
... db.employee.updateMany({name : "swa"}, {$set: {name : "gopi"}})
.b.employee.updateMany({name : "swa"}, {$set: {name : "gopi"}})
{ "acknowledged" : true, "matchedCount" : 2, "modifiedCount" : 2 }
> db.employee.find ({location :"banglore"})
{ "_id" : ObjectId("625d40b731d0accbf14fdf50"), "name" : "gopi", "dept" : "devloper", "location" : "banglore" }
> db.employee.find ({location :"hyderabad"})
> db.employee.find()
{ "_id" : ObjectId("625d3c60c809c2a262e2d71b") }
{ "_id" : ObjectId("625d3d29c809c2a262e2d71c"), "name" : "swapna", "dept" : "developer", "location" : "hyderbad" }
{ "_id" : ObjectId("625d3edd31d0accbf14fdf4e") }
{ "_id" : ObjectId("625d3f1e31d0accbf14fdf4f"), "name" : "gopi", "dept" : "devloper", "location" : "hyderbad" }
{ "_id" : ObjectId("625d40b731d0accbf14fdf50"), "name" : "gopi", "dept" : "devloper", "location" : "banglore" }
{ "_id" : ObjectId("625d40b731d0accbf14fdf51"), "name" : "gopi", "dept" : "automation", "location" : "chennai" }
> ^C
bye
