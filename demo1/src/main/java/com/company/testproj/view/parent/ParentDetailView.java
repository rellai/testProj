package com.company.testproj.view.parent;

import com.company.testproj.entity.Parent;

import com.company.testproj.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "parents/:id", layout = MainView.class)
@ViewController("tp1_Parent.detail")
@ViewDescriptor("parent-detail-view.xml")
@EditedEntityContainer("parentDc")
public class ParentDetailView extends StandardDetailView<Parent> {
}