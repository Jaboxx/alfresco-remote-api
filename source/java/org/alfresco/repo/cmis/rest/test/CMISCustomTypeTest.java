/*
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * Copyright (C) 2005-2008 Alfresco Software Limited.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.

 * As a special exception to the terms and conditions of version 2.0 of 
 * the GPL, you may redistribute this Program in connection with Free/Libre 
 * and Open Source Software ("FLOSS") applications as described in Alfresco's 
 * FLOSS exception.  You should have recieved a copy of the text describing 
 * the FLOSS exception, and it is also available here: 
 * http://www.alfresco.com/legal/licensing"
 */
package org.alfresco.repo.cmis.rest.test;



/**
 * CMIS API Test Harness
 * 
 * @author davidc
 */
public class CMISCustomTypeTest extends CMISTest
{
    
    @Override
    protected void setUp()
        throws Exception
    {
        // Uncomment to change default behaviour of tests  
        setDefaultRunAs("admin");
//        RemoteServer server = new RemoteServer();
//        server.username = "admin";
//        server.password = "admin";
//        setRemoteServer(server);
//        setArgsAsHeaders(false);
//        setValidateResponse(false);
//        setListener(new CMISTestListener(System.out));
//        setTraceReqRes(true);
        
        super.setUp();
    }

}
