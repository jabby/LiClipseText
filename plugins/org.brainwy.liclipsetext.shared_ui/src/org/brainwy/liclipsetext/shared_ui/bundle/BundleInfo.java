/**
 * Copyright (c) 2005-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on May 11, 2005
 *
 * @author Fabio Zadrozny
 */
package org.brainwy.liclipsetext.shared_ui.bundle;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.osgi.framework.Bundle;
import org.brainwy.liclipsetext.shared_core.bundle.BundleUtils;
import org.brainwy.liclipsetext.shared_ui.ImageCache;

/**
 * @author Fabio Zadrozny
 */
public class BundleInfo implements IBundleInfo {

    private Bundle bundle;

    public BundleInfo(Bundle bundle) {
        this.bundle = bundle;
    }

    /**
     * @throws CoreException
     * @see org.brainwy.liclipsetext.shared_ui.bundle.IBundleInfo#getRelativePath(org.eclipse.core.runtime.IPath)
     */
    @Override
    public File getRelativePath(IPath relative) throws CoreException {
        return BundleUtils.getRelative(relative, bundle);
    }

    /**
     * @see org.brainwy.liclipsetext.shared_ui.bundle.IBundleInfo#getPluginID()
     */
    @Override
    public String getPluginID() {
        return bundle.getSymbolicName();
    }

    private ImageCache imageCache;

    /**
     * @see org.brainwy.liclipsetext.shared_ui.bundle.IBundleInfo#getImageCache()
     */
    @Override
    public ImageCache getImageCache() {
        if (imageCache == null) {
            imageCache = new ImageCache(bundle.getEntry("/"));
        }
        return imageCache;
    }

}
