/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.baidutoolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.myorg.baidutoolbar.BaiduActionListener"
)
@ActionRegistration(
        iconBase = "org/myorg/baidutoolbar/baidu2.gif",
        displayName = "#CTL_BaiduActionListener"
)
@ActionReference(path = "Toolbars/File", position = -100)
@Messages("CTL_BaiduActionListener=baidu")
public final class BaiduActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
