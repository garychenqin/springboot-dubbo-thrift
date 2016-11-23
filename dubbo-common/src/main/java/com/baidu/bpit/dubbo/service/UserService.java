/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p/>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.baidu.bpit.dubbo.service;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-11-23")
public class UserService {

    public interface Iface {

        public com.baidu.bpit.dubbo.model.User getUserInfoByName(String username) throws org.apache.thrift.TException;

    }

    public interface AsyncIface {

        public void getUserInfoByName(String username, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

    }

    public static class Client extends org.apache.thrift.TServiceClient implements Iface {
        public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
            public Factory() {
            }

            public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
                return new Client(prot);
            }

            public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
                return new Client(iprot, oprot);
            }
        }

        public Client(org.apache.thrift.protocol.TProtocol prot) {
            super(prot, prot);
        }

        public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
            super(iprot, oprot);
        }

        public com.baidu.bpit.dubbo.model.User getUserInfoByName(String username) throws org.apache.thrift.TException {
            send_getUserInfoByName(username);
            return recv_getUserInfoByName();
        }

        public void send_getUserInfoByName(String username) throws org.apache.thrift.TException {
            getUserInfoByName_args args = new getUserInfoByName_args();
            args.setUsername(username);
            sendBase("getUserInfoByName", args);
        }

        public com.baidu.bpit.dubbo.model.User recv_getUserInfoByName() throws org.apache.thrift.TException {
            getUserInfoByName_result result = new getUserInfoByName_result();
            receiveBase(result, "getUserInfoByName");
            if (result.isSetSuccess()) {
                return result.success;
            }
            throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "getUserInfoByName failed: unknown result");
        }

    }

    public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
        public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
            private org.apache.thrift.async.TAsyncClientManager clientManager;
            private org.apache.thrift.protocol.TProtocolFactory protocolFactory;

            public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
                this.clientManager = clientManager;
                this.protocolFactory = protocolFactory;
            }

            public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
                return new AsyncClient(protocolFactory, clientManager, transport);
            }
        }

        public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        public void getUserInfoByName(String username, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
            checkReady();
            getUserInfoByName_call method_call = new getUserInfoByName_call(username, resultHandler, this, ___protocolFactory, ___transport);
            this.___currentMethod = method_call;
            ___manager.call(method_call);
        }

        public static class getUserInfoByName_call extends org.apache.thrift.async.TAsyncMethodCall {
            private String username;

            public getUserInfoByName_call(String username, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.username = username;
            }

            public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
                prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("getUserInfoByName", org.apache.thrift.protocol.TMessageType.CALL, 0));
                getUserInfoByName_args args = new getUserInfoByName_args();
                args.setUsername(username);
                args.write(prot);
                prot.writeMessageEnd();
            }

            public com.baidu.bpit.dubbo.model.User getResult() throws org.apache.thrift.TException {
                if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
                org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
                return (new Client(prot)).recv_getUserInfoByName();
            }
        }

    }

    public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
        }

        protected Processor(I iface, Map<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }

        private static <I extends Iface> Map<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(Map<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
            processMap.put("getUserInfoByName", new getUserInfoByName());
            return processMap;
        }

        public static class getUserInfoByName<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getUserInfoByName_args> {
            public getUserInfoByName() {
                super("getUserInfoByName");
            }

            public getUserInfoByName_args getEmptyArgsInstance() {
                return new getUserInfoByName_args();
            }

            protected boolean isOneway() {
                return false;
            }

            public getUserInfoByName_result getResult(I iface, getUserInfoByName_args args) throws org.apache.thrift.TException {
                getUserInfoByName_result result = new getUserInfoByName_result();
                result.success = iface.getUserInfoByName(args.username);
                return result;
            }
        }

    }

    public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
        }

        protected AsyncProcessor(I iface, Map<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>> processMap) {
            super(iface, getProcessMap(processMap));
        }

        private static <I extends AsyncIface> Map<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>> getProcessMap(Map<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>> processMap) {
            processMap.put("getUserInfoByName", new getUserInfoByName());
            return processMap;
        }

        public static class getUserInfoByName<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, getUserInfoByName_args, com.baidu.bpit.dubbo.model.User> {
            public getUserInfoByName() {
                super("getUserInfoByName");
            }

            public getUserInfoByName_args getEmptyArgsInstance() {
                return new getUserInfoByName_args();
            }

            public AsyncMethodCallback<com.baidu.bpit.dubbo.model.User> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
                final org.apache.thrift.AsyncProcessFunction fcall = this;
                return new AsyncMethodCallback<com.baidu.bpit.dubbo.model.User>() {
                    public void onComplete(com.baidu.bpit.dubbo.model.User o) {
                        getUserInfoByName_result result = new getUserInfoByName_result();
                        result.success = o;
                        try {
                            fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY, seqid);
                            return;
                        } catch (Exception e) {
                            LOGGER.error("Exception writing to internal frame buffer", e);
                        }
                        fb.close();
                    }

                    public void onError(Exception e) {
                        byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
                        org.apache.thrift.TBase msg;
                        getUserInfoByName_result result = new getUserInfoByName_result();
                        {
                            msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
                            msg = (org.apache.thrift.TBase) new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
                        }
                        try {
                            fcall.sendResponse(fb, msg, msgType, seqid);
                            return;
                        } catch (Exception ex) {
                            LOGGER.error("Exception writing to internal frame buffer", ex);
                        }
                        fb.close();
                    }
                };
            }

            protected boolean isOneway() {
                return false;
            }

            public void start(I iface, getUserInfoByName_args args, org.apache.thrift.async.AsyncMethodCallback<com.baidu.bpit.dubbo.model.User> resultHandler) throws TException {
                iface.getUserInfoByName(args.username, resultHandler);
            }
        }

    }

    public static class getUserInfoByName_args implements org.apache.thrift.TBase<getUserInfoByName_args, getUserInfoByName_args._Fields>, java.io.Serializable, Cloneable, Comparable<getUserInfoByName_args> {
        private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getUserInfoByName_args");

        private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short) 1);

        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

        static {
            schemes.put(StandardScheme.class, new getUserInfoByName_argsStandardSchemeFactory());
            schemes.put(TupleScheme.class, new getUserInfoByName_argsTupleSchemeFactory());
        }

        public String username; // required

        /**
         * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
         */
        public enum _Fields implements org.apache.thrift.TFieldIdEnum {
            USERNAME((short) 1, "username");

            private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

            static {
                for (_Fields field : EnumSet.allOf(_Fields.class)) {
                    byName.put(field.getFieldName(), field);
                }
            }

            /**
             * Find the _Fields constant that matches fieldId, or null if its not found.
             */
            public static _Fields findByThriftId(int fieldId) {
                switch (fieldId) {
                    case 1: // USERNAME
                        return USERNAME;
                    default:
                        return null;
                }
            }

            /**
             * Find the _Fields constant that matches fieldId, throwing an exception
             * if it is not found.
             */
            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields fields = findByThriftId(fieldId);
                if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
                return fields;
            }

            /**
             * Find the _Fields constant that matches name, or null if its not found.
             */
            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            private final short _thriftId;
            private final String _fieldName;

            _Fields(short thriftId, String fieldName) {
                _thriftId = thriftId;
                _fieldName = fieldName;
            }

            public short getThriftFieldId() {
                return _thriftId;
            }

            public String getFieldName() {
                return _fieldName;
            }
        }

        // isset id assignments
        public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

        static {
            Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
            tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT,
                    new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
            metaDataMap = Collections.unmodifiableMap(tmpMap);
            org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getUserInfoByName_args.class, metaDataMap);
        }

        public getUserInfoByName_args() {
        }

        public getUserInfoByName_args(
                String username) {
            this();
            this.username = username;
        }

        /**
         * Performs a deep copy on <i>other</i>.
         */
        public getUserInfoByName_args(getUserInfoByName_args other) {
            if (other.isSetUsername()) {
                this.username = other.username;
            }
        }

        public getUserInfoByName_args deepCopy() {
            return new getUserInfoByName_args(this);
        }

        @Override
        public void clear() {
            this.username = null;
        }

        public String getUsername() {
            return this.username;
        }

        public getUserInfoByName_args setUsername(String username) {
            this.username = username;
            return this;
        }

        public void unsetUsername() {
            this.username = null;
        }

        /**
         * Returns true if field username is set (has been assigned a value) and false otherwise
         */
        public boolean isSetUsername() {
            return this.username != null;
        }

        public void setUsernameIsSet(boolean value) {
            if (!value) {
                this.username = null;
            }
        }

        public void setFieldValue(_Fields field, Object value) {
            switch (field) {
                case USERNAME:
                    if (value == null) {
                        unsetUsername();
                    } else {
                        setUsername((String) value);
                    }
                    break;

            }
        }

        public Object getFieldValue(_Fields field) {
            switch (field) {
                case USERNAME:
                    return getUsername();

            }
            throw new IllegalStateException();
        }

        /**
         * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
         */
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }

            switch (field) {
                case USERNAME:
                    return isSetUsername();
            }
            throw new IllegalStateException();
        }

        @Override
        public boolean equals(Object that) {
            if (that == null)
                return false;
            if (that instanceof getUserInfoByName_args)
                return this.equals((getUserInfoByName_args) that);
            return false;
        }

        public boolean equals(getUserInfoByName_args that) {
            if (that == null)
                return false;

            boolean this_present_username = true && this.isSetUsername();
            boolean that_present_username = true && that.isSetUsername();
            if (this_present_username || that_present_username) {
                if (!(this_present_username && that_present_username))
                    return false;
                if (!this.username.equals(that.username))
                    return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            List<Object> list = new ArrayList<Object>();

            boolean present_username = true && (isSetUsername());
            list.add(present_username);
            if (present_username)
                list.add(username);

            return list.hashCode();
        }

        @Override
        public int compareTo(getUserInfoByName_args other) {
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }

            int lastComparison = 0;

            lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
            if (lastComparison != 0) {
                return lastComparison;
            }
            if (isSetUsername()) {
                lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
                if (lastComparison != 0) {
                    return lastComparison;
                }
            }
            return 0;
        }

        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("getUserInfoByName_args(");
            boolean first = true;

            sb.append("username:");
            if (this.username == null) {
                sb.append("null");
            } else {
                sb.append(this.username);
            }
            first = false;
            sb.append(")");
            return sb.toString();
        }

        public void validate() throws org.apache.thrift.TException {
            // check for required fields
            // check for sub-struct validity
        }

        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            try {
                write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
            } catch (org.apache.thrift.TException te) {
                throw new java.io.IOException(te);
            }
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
            try {
                read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
            } catch (org.apache.thrift.TException te) {
                throw new java.io.IOException(te);
            }
        }

        private static class getUserInfoByName_argsStandardSchemeFactory implements SchemeFactory {
            public getUserInfoByName_argsStandardScheme getScheme() {
                return new getUserInfoByName_argsStandardScheme();
            }
        }

        private static class getUserInfoByName_argsStandardScheme extends StandardScheme<getUserInfoByName_args> {

            public void read(org.apache.thrift.protocol.TProtocol iprot, getUserInfoByName_args struct) throws org.apache.thrift.TException {
                org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();
                while (true) {
                    schemeField = iprot.readFieldBegin();
                    if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    }
                    switch (schemeField.id) {
                        case 1: // USERNAME
                            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                                struct.username = iprot.readString();
                                struct.setUsernameIsSet(true);
                            } else {
                                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                            }
                            break;
                        default:
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                // check for required fields of primitive type, which can't be checked in the validate method
                struct.validate();
            }

            public void write(org.apache.thrift.protocol.TProtocol oprot, getUserInfoByName_args struct) throws org.apache.thrift.TException {
                struct.validate();

                oprot.writeStructBegin(STRUCT_DESC);
                if (struct.username != null) {
                    oprot.writeFieldBegin(USERNAME_FIELD_DESC);
                    oprot.writeString(struct.username);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }

        }

        private static class getUserInfoByName_argsTupleSchemeFactory implements SchemeFactory {
            public getUserInfoByName_argsTupleScheme getScheme() {
                return new getUserInfoByName_argsTupleScheme();
            }
        }

        private static class getUserInfoByName_argsTupleScheme extends TupleScheme<getUserInfoByName_args> {

            @Override
            public void write(org.apache.thrift.protocol.TProtocol prot, getUserInfoByName_args struct) throws org.apache.thrift.TException {
                TTupleProtocol oprot = (TTupleProtocol) prot;
                BitSet optionals = new BitSet();
                if (struct.isSetUsername()) {
                    optionals.set(0);
                }
                oprot.writeBitSet(optionals, 1);
                if (struct.isSetUsername()) {
                    oprot.writeString(struct.username);
                }
            }

            @Override
            public void read(org.apache.thrift.protocol.TProtocol prot, getUserInfoByName_args struct) throws org.apache.thrift.TException {
                TTupleProtocol iprot = (TTupleProtocol) prot;
                BitSet incoming = iprot.readBitSet(1);
                if (incoming.get(0)) {
                    struct.username = iprot.readString();
                    struct.setUsernameIsSet(true);
                }
            }
        }

    }

    public static class getUserInfoByName_result implements org.apache.thrift.TBase<getUserInfoByName_result, getUserInfoByName_result._Fields>, java.io.Serializable, Cloneable, Comparable<getUserInfoByName_result> {
        private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getUserInfoByName_result");

        private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short) 0);

        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

        static {
            schemes.put(StandardScheme.class, new getUserInfoByName_resultStandardSchemeFactory());
            schemes.put(TupleScheme.class, new getUserInfoByName_resultTupleSchemeFactory());
        }

        public com.baidu.bpit.dubbo.model.User success; // required

        /**
         * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
         */
        public enum _Fields implements org.apache.thrift.TFieldIdEnum {
            SUCCESS((short) 0, "success");

            private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

            static {
                for (_Fields field : EnumSet.allOf(_Fields.class)) {
                    byName.put(field.getFieldName(), field);
                }
            }

            /**
             * Find the _Fields constant that matches fieldId, or null if its not found.
             */
            public static _Fields findByThriftId(int fieldId) {
                switch (fieldId) {
                    case 0: // SUCCESS
                        return SUCCESS;
                    default:
                        return null;
                }
            }

            /**
             * Find the _Fields constant that matches fieldId, throwing an exception
             * if it is not found.
             */
            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields fields = findByThriftId(fieldId);
                if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
                return fields;
            }

            /**
             * Find the _Fields constant that matches name, or null if its not found.
             */
            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            private final short _thriftId;
            private final String _fieldName;

            _Fields(short thriftId, String fieldName) {
                _thriftId = thriftId;
                _fieldName = fieldName;
            }

            public short getThriftFieldId() {
                return _thriftId;
            }

            public String getFieldName() {
                return _fieldName;
            }
        }

        // isset id assignments
        public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

        static {
            Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
            tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT,
                    new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.bpit.dubbo.model.User.class)));
            metaDataMap = Collections.unmodifiableMap(tmpMap);
            org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getUserInfoByName_result.class, metaDataMap);
        }

        public getUserInfoByName_result() {
        }

        public getUserInfoByName_result(
                com.baidu.bpit.dubbo.model.User success) {
            this();
            this.success = success;
        }

        /**
         * Performs a deep copy on <i>other</i>.
         */
        public getUserInfoByName_result(getUserInfoByName_result other) {
            if (other.isSetSuccess()) {
                this.success = new com.baidu.bpit.dubbo.model.User(other.success);
            }
        }

        public getUserInfoByName_result deepCopy() {
            return new getUserInfoByName_result(this);
        }

        @Override
        public void clear() {
            this.success = null;
        }

        public com.baidu.bpit.dubbo.model.User getSuccess() {
            return this.success;
        }

        public getUserInfoByName_result setSuccess(com.baidu.bpit.dubbo.model.User success) {
            this.success = success;
            return this;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        /**
         * Returns true if field success is set (has been assigned a value) and false otherwise
         */
        public boolean isSetSuccess() {
            return this.success != null;
        }

        public void setSuccessIsSet(boolean value) {
            if (!value) {
                this.success = null;
            }
        }

        public void setFieldValue(_Fields field, Object value) {
            switch (field) {
                case SUCCESS:
                    if (value == null) {
                        unsetSuccess();
                    } else {
                        setSuccess((com.baidu.bpit.dubbo.model.User) value);
                    }
                    break;

            }
        }

        public Object getFieldValue(_Fields field) {
            switch (field) {
                case SUCCESS:
                    return getSuccess();

            }
            throw new IllegalStateException();
        }

        /**
         * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
         */
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }

            switch (field) {
                case SUCCESS:
                    return isSetSuccess();
            }
            throw new IllegalStateException();
        }

        @Override
        public boolean equals(Object that) {
            if (that == null)
                return false;
            if (that instanceof getUserInfoByName_result)
                return this.equals((getUserInfoByName_result) that);
            return false;
        }

        public boolean equals(getUserInfoByName_result that) {
            if (that == null)
                return false;

            boolean this_present_success = true && this.isSetSuccess();
            boolean that_present_success = true && that.isSetSuccess();
            if (this_present_success || that_present_success) {
                if (!(this_present_success && that_present_success))
                    return false;
                if (!this.success.equals(that.success))
                    return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            List<Object> list = new ArrayList<Object>();

            boolean present_success = true && (isSetSuccess());
            list.add(present_success);
            if (present_success)
                list.add(success);

            return list.hashCode();
        }

        @Override
        public int compareTo(getUserInfoByName_result other) {
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }

            int lastComparison = 0;

            lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
            if (lastComparison != 0) {
                return lastComparison;
            }
            if (isSetSuccess()) {
                lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
                if (lastComparison != 0) {
                    return lastComparison;
                }
            }
            return 0;
        }

        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("getUserInfoByName_result(");
            boolean first = true;

            sb.append("success:");
            if (this.success == null) {
                sb.append("null");
            } else {
                sb.append(this.success);
            }
            first = false;
            sb.append(")");
            return sb.toString();
        }

        public void validate() throws org.apache.thrift.TException {
            // check for required fields
            // check for sub-struct validity
            if (success != null) {
                success.validate();
            }
        }

        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            try {
                write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
            } catch (org.apache.thrift.TException te) {
                throw new java.io.IOException(te);
            }
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
            try {
                read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
            } catch (org.apache.thrift.TException te) {
                throw new java.io.IOException(te);
            }
        }

        private static class getUserInfoByName_resultStandardSchemeFactory implements SchemeFactory {
            public getUserInfoByName_resultStandardScheme getScheme() {
                return new getUserInfoByName_resultStandardScheme();
            }
        }

        private static class getUserInfoByName_resultStandardScheme extends StandardScheme<getUserInfoByName_result> {

            public void read(org.apache.thrift.protocol.TProtocol iprot, getUserInfoByName_result struct) throws org.apache.thrift.TException {
                org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();
                while (true) {
                    schemeField = iprot.readFieldBegin();
                    if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    }
                    switch (schemeField.id) {
                        case 0: // SUCCESS
                            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                                struct.success = new com.baidu.bpit.dubbo.model.User();
                                struct.success.read(iprot);
                                struct.setSuccessIsSet(true);
                            } else {
                                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                            }
                            break;
                        default:
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                // check for required fields of primitive type, which can't be checked in the validate method
                struct.validate();
            }

            public void write(org.apache.thrift.protocol.TProtocol oprot, getUserInfoByName_result struct) throws org.apache.thrift.TException {
                struct.validate();

                oprot.writeStructBegin(STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }

        }

        private static class getUserInfoByName_resultTupleSchemeFactory implements SchemeFactory {
            public getUserInfoByName_resultTupleScheme getScheme() {
                return new getUserInfoByName_resultTupleScheme();
            }
        }

        private static class getUserInfoByName_resultTupleScheme extends TupleScheme<getUserInfoByName_result> {

            @Override
            public void write(org.apache.thrift.protocol.TProtocol prot, getUserInfoByName_result struct) throws org.apache.thrift.TException {
                TTupleProtocol oprot = (TTupleProtocol) prot;
                BitSet optionals = new BitSet();
                if (struct.isSetSuccess()) {
                    optionals.set(0);
                }
                oprot.writeBitSet(optionals, 1);
                if (struct.isSetSuccess()) {
                    struct.success.write(oprot);
                }
            }

            @Override
            public void read(org.apache.thrift.protocol.TProtocol prot, getUserInfoByName_result struct) throws org.apache.thrift.TException {
                TTupleProtocol iprot = (TTupleProtocol) prot;
                BitSet incoming = iprot.readBitSet(1);
                if (incoming.get(0)) {
                    struct.success = new com.baidu.bpit.dubbo.model.User();
                    struct.success.read(iprot);
                    struct.setSuccessIsSet(true);
                }
            }
        }

    }

}
