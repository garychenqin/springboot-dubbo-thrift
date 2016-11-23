namespace java com.baidu.bpit.dubbo.model

// User result model
//thrift -gen Java thift_file
struct User {
    1:optional string name,
    2:optional i32 age,
    3:optional string city,
    4:optional list<User> sub
}