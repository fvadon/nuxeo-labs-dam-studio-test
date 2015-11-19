/*
 * (C) Copyright 2006-2015 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     bstefanescu
 */
package org.nuxeo.ecm.platform.test.dam.studio;

import org.nuxeo.ecm.automation.test.AutomationFeature;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.LocalDeploy;
import org.nuxeo.runtime.test.runner.SimpleFeature;

/**
 * @author <a href="mailto:fvadon@nuxeo.com">Fred Vadon</a>
 */
@Deploy({"org.nuxeo.ecm.platform.commandline.executor",
    "org.nuxeo.ecm.platform.picture.core",
    "org.nuxeo.ecm.platform.rendition.core",
    "org.nuxeo.ecm.platform.video.core",
    "org.nuxeo.ecm.platform.audio.core",
    "org.nuxeo.ecm.automation.scripting",
    "org.nuxeo.ecm.platform.web.common"})
@LocalDeploy({"org.nuxeo.ecm.platform.test.dam.studio:OSGI-INF/fake-sqldirectory-contrib.xml"})
@Features({AutomationFeature.class })
public class StudioDamFeature extends SimpleFeature {

}
