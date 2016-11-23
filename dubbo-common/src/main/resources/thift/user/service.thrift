include "model.thrift"

//thrift -gen Java thift_file
namespace java com.baidu.bpit.dubbo.service

service UserService {
    model.User getUserInfoByName(1:string username)
}