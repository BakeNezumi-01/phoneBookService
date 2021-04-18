# phoneBookService

testing project for dins

# phoneBookService

command line: 
java -jar *phoneBookService.jar addres*
for example
java -jar E:\job\phoneBookService\out\artifacts\phoneBookService_jar\phoneBookService.jar

Then, go to localhost:8080/api/... 

"/api/phone"
    "/{id}" GET - getPhoneById
    "/{id}" PUT - updatePhoneById
    "/user/{id}" POST - setPhoneByUserId
    "/{id}" DELETE - deletePhoneById
"/api/user"
    "/" GET - getUserMap
    "/" POST - setUser
    "/{id}" GET - getUserById
    "/{id}" PUT - updateUserById
    "/{id}" DELETE - deleteUserById
    "/phone/{id}" GET - getUserPhonesById
"/api"
    "/search/user/{partOfName}" GET - searchUserByPartOfName
    "/search/phone/{phone}" GET - searchPhone
    
    
for example:
http://localhost:8080/api/user/2
{"firstName":"first2","secondName":"second2","id":2,"phoneBook":{"6":{"id":6,"firstName":"sfg","secondName":"gdsfg","phoneNumber":"88005693599"},"7":{"id":7,"firstName":"asdfdsf","secondName":"secovbnd2","phoneNumber":"890006662577"},"8":{"id":8,"firstName":"bb","secondName":"nb","phoneNumber":"72563698588"}}}
