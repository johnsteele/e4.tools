/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.e4.internal.tools.wizards.model;

import org.eclipse.e4.ui.model.fragment.MFragmentFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;


public class NewContributionModelWizard extends BaseApplicationModelWizard {

	@Override
	public String getDefaultFileName() {
		return "fragment.e4xmi";
	}
	
	protected EObject createInitialModel() {
		return (EObject) MFragmentFactory.INSTANCE.createModelFragments();
	}
	
	@Override
	protected NewModelFilePage createWizardPage(ISelection selection) {
		return new NewModelFilePage(selection,getDefaultFileName());
	}
}