package org.omg.IOP;

/**
* org/omg/IOP/ServiceContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u131/8869/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, March 15, 2017 1:25:04 AM PDT
*/

public final class ServiceContextHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.ServiceContext value = null;

  public ServiceContextHolder ()
  {
  }

  public ServiceContextHolder (org.omg.IOP.ServiceContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.ServiceContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.ServiceContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.ServiceContextHelper.type ();
  }

}
