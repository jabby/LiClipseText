/**
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.brainwy.liclipsetext.shared_core.resource_stubs;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

public class AbstractIFolderStub extends AbstractIContainerStub implements IFolder {

    @Override
    public void create(boolean force, boolean local, IProgressMonitor monitor) throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void create(int updateFlags, boolean local, IProgressMonitor monitor) throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void createLink(IPath localLocation, int updateFlags, IProgressMonitor monitor) throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void createLink(URI location, int updateFlags, IProgressMonitor monitor) throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    public void createGroup(int updateFlags, IProgressMonitor monitor) throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void delete(boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public IFile getFile(String name) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public IFolder getFolder(String name) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void move(IPath destination, boolean force, boolean keepHistory, IProgressMonitor monitor)
            throws CoreException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public int getType() {
        return IResource.FOLDER;
    }

}
