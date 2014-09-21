/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author x12340121
 */
public class DisabilityGUI extends javax.swing.JFrame {
    private String Email;
    private String Subject;
    private String message;
    private int count;
    private Array msg[];
    private int num;
    /**
     * Creates new form NewJFrame
     */
    public DisabilityGUI() {
        initComponents();
        
        
        
        num = 10;
         Email = new String ();
        Subject = new String ();
        message = new String ();
        count = 0;
        msg = new Array[100];
        
        
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(true);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(true);
     
      usefuldefBtn.setVisible(true);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        q1btngrp = new javax.swing.ButtonGroup();
        q2btngrp = new javax.swing.ButtonGroup();
        q3btngrp = new javax.swing.ButtonGroup();
        q4btngrp = new javax.swing.ButtonGroup();
        q5btngrp = new javax.swing.ButtonGroup();
        q6btngrp = new javax.swing.ButtonGroup();
        q7btngrp = new javax.swing.ButtonGroup();
        q8btngrp = new javax.swing.ButtonGroup();
        q9btngrp = new javax.swing.ButtonGroup();
        q10btngrp = new javax.swing.ButtonGroup();
        q11btngrp = new javax.swing.ButtonGroup();
        q12btngrp = new javax.swing.ButtonGroup();
        resBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        emaillbl = new javax.swing.JLabel();
        subjectlbl = new javax.swing.JLabel();
        messagelbl = new javax.swing.JLabel();
        serviceBtn = new javax.swing.JButton();
        khanbtn = new javax.swing.JButton();
        mathtutorbtn = new javax.swing.JButton();
        openunibtn = new javax.swing.JButton();
        emailField1 = new javax.swing.JTextField();
        subjectField2 = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        messagepane3 = new javax.swing.JScrollPane();
        messagefield3 = new javax.swing.JTextArea();
        diaginfo = new javax.swing.JScrollPane();
        diagtxt = new javax.swing.JTextArea();
        mathcentrebtn = new javax.swing.JButton();
        quizBtn = new javax.swing.JButton();
        appointmentBtn = new javax.swing.JButton();
        wkshpinfo = new javax.swing.JScrollPane();
        wkshptxt = new javax.swing.JTextArea();
        onetooneBtn = new javax.swing.JButton();
        wkshpBtn = new javax.swing.JButton();
        DiagBtn = new javax.swing.JButton();
        viewwkshpttBtn = new javax.swing.JButton();
        usefuldefBtn = new javax.swing.JButton();
        usefuldeflbl = new javax.swing.JLabel();
        jResplbl = new javax.swing.JLabel();
        displaybtn = new javax.swing.JButton();
        quizpane = new javax.swing.JScrollPane();
        quizpnl = new javax.swing.JPanel();
        quizheaderlbl = new javax.swing.JLabel();
        dyscalquiz = new javax.swing.JLabel();
        q1lbl = new javax.swing.JLabel();
        q1nobtn = new javax.swing.JRadioButton();
        q1yesbtn = new javax.swing.JRadioButton();
        q2lbl = new javax.swing.JLabel();
        q3lbl = new javax.swing.JLabel();
        q4lbl = new javax.swing.JLabel();
        q5lbl = new javax.swing.JLabel();
        q6lbl = new javax.swing.JLabel();
        q7lbl = new javax.swing.JLabel();
        q8lbl = new javax.swing.JLabel();
        q9lbl = new javax.swing.JLabel();
        q10lbl = new javax.swing.JLabel();
        q11lbl = new javax.swing.JLabel();
        q12lbl = new javax.swing.JLabel();
        qsubmitbtn = new javax.swing.JButton();
        q2yes = new javax.swing.JRadioButton();
        q2no = new javax.swing.JRadioButton();
        q3yes = new javax.swing.JRadioButton();
        q3no = new javax.swing.JRadioButton();
        q4yes = new javax.swing.JRadioButton();
        q4no = new javax.swing.JRadioButton();
        q5yes = new javax.swing.JRadioButton();
        q5no = new javax.swing.JRadioButton();
        q6yes = new javax.swing.JRadioButton();
        q6no = new javax.swing.JRadioButton();
        q7yes = new javax.swing.JRadioButton();
        q7no = new javax.swing.JRadioButton();
        q8yes = new javax.swing.JRadioButton();
        q8no = new javax.swing.JRadioButton();
        q9yes = new javax.swing.JRadioButton();
        q9no = new javax.swing.JRadioButton();
        q10yes = new javax.swing.JRadioButton();
        q10no = new javax.swing.JRadioButton();
        q11yes = new javax.swing.JRadioButton();
        q11no = new javax.swing.JRadioButton();
        q12yes = new javax.swing.JRadioButton();
        q12no = new javax.swing.JRadioButton();
        onetoonearea = new javax.swing.JScrollPane();
        ototxt = new javax.swing.JTextArea();
        definitionpane = new javax.swing.JScrollPane();
        definitionpanel = new javax.swing.JPanel();
        alphabtn = new javax.swing.JButton();
        Althypbtn = new javax.swing.JButton();
        anlvarybtn = new javax.swing.JButton();
        avdevbtn = new javax.swing.JButton();
        betabtn = new javax.swing.JButton();
        ctrllimittheobtn = new javax.swing.JButton();
        x2btn = new javax.swing.JButton();
        confacbtn = new javax.swing.JButton();
        corcoe = new javax.swing.JButton();
        critregbtn = new javax.swing.JButton();
        dfbtn = new javax.swing.JButton();
        statfbtn = new javax.swing.JButton();
        ftestbtn = new javax.swing.JButton();
        histogbtn = new javax.swing.JButton();
        meanbtn = new javax.swing.JButton();
        meansqbtn = new javax.swing.JButton();
        medianbtn = new javax.swing.JButton();
        modebtn = new javax.swing.JButton();
        nullhypobtn = new javax.swing.JButton();
        onetailtbtn = new javax.swing.JButton();
        parambtn = new javax.swing.JButton();
        popbtn = new javax.swing.JButton();
        powbtn = new javax.swing.JButton();
        predbtn = new javax.swing.JButton();
        randsampbtn = new javax.swing.JButton();
        rangebtn = new javax.swing.JButton();
        regrebtn = new javax.swing.JButton();
        regtomeanbtn = new javax.swing.JButton();
        relatemeabtn = new javax.swing.JButton();
        sampmeanxbtn = new javax.swing.JButton();
        sampdistbtn = new javax.swing.JButton();
        s2btn = new javax.swing.JButton();
        standdevbtn = new javax.swing.JButton();
        standerrbtn = new javax.swing.JButton();
        stasticbtn = new javax.swing.JButton();
        stathypbtn = new javax.swing.JButton();
        statsigbtn = new javax.swing.JButton();
        stattestbtn = new javax.swing.JButton();
        sumofsqbtn = new javax.swing.JButton();
        stattbtn = new javax.swing.JButton();
        ttestbtn = new javax.swing.JButton();
        transrulebtn = new javax.swing.JButton();
        twotailtestbtn = new javax.swing.JButton();
        typeierbtn = new javax.swing.JButton();
        typeiierbtn = new javax.swing.JButton();
        unbiasestbtn = new javax.swing.JButton();
        varibtn = new javax.swing.JButton();
        statzbtn = new javax.swing.JButton();
        zscorebtn = new javax.swing.JButton();
        timetablepane = new javax.swing.JScrollPane();
        timetablepnl = new javax.swing.JPanel();
        timetablelbl = new javax.swing.JLabel();
        alphapane = new javax.swing.JScrollPane();
        alphaarea = new javax.swing.JTextArea();
        althyppane = new javax.swing.JScrollPane();
        althyparea = new javax.swing.JTextArea();
        anlvarpane = new javax.swing.JScrollPane();
        anlvararea = new javax.swing.JTextArea();
        avdevpane = new javax.swing.JScrollPane();
        avdevarea = new javax.swing.JTextArea();
        betapane = new javax.swing.JScrollPane();
        betaarea = new javax.swing.JTextArea();
        Ctrllmttheopane = new javax.swing.JScrollPane();
        ctrllmtarea = new javax.swing.JTextArea();
        x2pane = new javax.swing.JScrollPane();
        x2area = new javax.swing.JTextArea();
        confactpane = new javax.swing.JScrollPane();
        confactarea = new javax.swing.JTextArea();
        corlcoefpane = new javax.swing.JScrollPane();
        corlcoefarea = new javax.swing.JTextArea();
        critregpane = new javax.swing.JScrollPane();
        critregarea = new javax.swing.JTextArea();
        dfpane = new javax.swing.JScrollPane();
        dfarea = new javax.swing.JTextArea();
        statfpane = new javax.swing.JScrollPane();
        statfarea = new javax.swing.JTextArea();
        ftestpane = new javax.swing.JScrollPane();
        ftestarea = new javax.swing.JTextArea();
        histogpane = new javax.swing.JScrollPane();
        histogarea = new javax.swing.JTextArea();
        meanpane = new javax.swing.JScrollPane();
        meanarea = new javax.swing.JTextArea();
        meansqpane = new javax.swing.JScrollPane();
        meansqarea = new javax.swing.JTextArea();
        medianpane = new javax.swing.JScrollPane();
        medianarea = new javax.swing.JTextArea();
        modepane = new javax.swing.JScrollPane();
        modearea = new javax.swing.JTextArea();
        nullhyppane = new javax.swing.JScrollPane();
        nullhyparea = new javax.swing.JTextArea();
        ottpane = new javax.swing.JScrollPane();
        ottarea = new javax.swing.JTextArea();
        parampane = new javax.swing.JScrollPane();
        paramarea = new javax.swing.JTextArea();
        poppane = new javax.swing.JScrollPane();
        poparea = new javax.swing.JTextArea();
        powerpane = new javax.swing.JScrollPane();
        powerarea = new javax.swing.JTextArea();
        predictpane = new javax.swing.JScrollPane();
        predictarea = new javax.swing.JTextArea();
        randsamppane = new javax.swing.JScrollPane();
        randsamparea = new javax.swing.JTextArea();
        rangepane = new javax.swing.JScrollPane();
        rangearea = new javax.swing.JTextArea();
        regpane = new javax.swing.JScrollPane();
        regarea = new javax.swing.JTextArea();
        regtomeanpane = new javax.swing.JScrollPane();
        regtomeanarea = new javax.swing.JTextArea();
        relatedmeasurepane = new javax.swing.JScrollPane();
        relatedmeasurearea = new javax.swing.JTextArea();
        sampmeanxbarpane = new javax.swing.JScrollPane();
        sampmeanxbararea = new javax.swing.JTextArea();
        sampdistpane = new javax.swing.JScrollPane();
        sampdistarea = new javax.swing.JTextArea();
        s2pane = new javax.swing.JScrollPane();
        s2area = new javax.swing.JTextArea();
        standdevpane = new javax.swing.JScrollPane();
        standdevarea = new javax.swing.JTextArea();
        standerrpane = new javax.swing.JScrollPane();
        standerrarea = new javax.swing.JTextArea();
        statisticpane = new javax.swing.JScrollPane();
        statisticarea = new javax.swing.JTextArea();
        stathyppane = new javax.swing.JScrollPane();
        stathyparea = new javax.swing.JTextArea();
        statsigpane = new javax.swing.JScrollPane();
        statsigarea = new javax.swing.JTextArea();
        stattestpane = new javax.swing.JScrollPane();
        stattestarea = new javax.swing.JTextArea();
        sumofsqpane = new javax.swing.JScrollPane();
        sumofsqarea = new javax.swing.JTextArea();
        stattpane = new javax.swing.JScrollPane();
        stattarea = new javax.swing.JTextArea();
        ttestpane = new javax.swing.JScrollPane();
        ttestarea = new javax.swing.JTextArea();
        transrulespane = new javax.swing.JScrollPane();
        transrulesarea = new javax.swing.JTextArea();
        twotailedtestpane = new javax.swing.JScrollPane();
        twotailedtestarea = new javax.swing.JTextArea();
        typeIerrpane = new javax.swing.JScrollPane();
        typeIerrarea = new javax.swing.JTextArea();
        typeIIerrpane = new javax.swing.JScrollPane();
        typeIIerrarea = new javax.swing.JTextArea();
        unbiasestpane = new javax.swing.JScrollPane();
        unbiasedarea = new javax.swing.JTextArea();
        varpane = new javax.swing.JScrollPane();
        vararea = new javax.swing.JTextArea();
        statzpane = new javax.swing.JScrollPane();
        statzarea = new javax.swing.JTextArea();
        zscorepane = new javax.swing.JScrollPane();
        zscorearea = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(415, 738));
        getContentPane().setLayout(null);

        resBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        resBtn.setText("Resources");
        resBtn.setOpaque(false);
        resBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resBtn);
        resBtn.setBounds(20, 180, 90, 60);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/homebutton.jpg"))); // NOI18N
        homeBtn.setOpaque(false);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(140, 610, 100, 70);

        emaillbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emaillbl.setText("Email:");
        getContentPane().add(emaillbl);
        emaillbl.setBounds(40, 280, 70, 20);

        subjectlbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectlbl.setText("Subject:");
        getContentPane().add(subjectlbl);
        subjectlbl.setBounds(40, 340, 60, 20);

        messagelbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        messagelbl.setText("Message:");
        getContentPane().add(messagelbl);
        messagelbl.setBounds(40, 390, 60, 17);

        serviceBtn.setText("<html>Tap here for useful <br> <center>websites</center>");
        serviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });
        getContentPane().add(serviceBtn);
        serviceBtn.setBounds(120, 480, 140, 70);

        khanbtn.setText("Khan Academy");
        khanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(khanbtn);
        khanbtn.setBounds(50, 490, 250, 50);

        mathtutorbtn.setText("Math tutor");
        mathtutorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathtutorbtnActionPerformed(evt);
            }
        });
        getContentPane().add(mathtutorbtn);
        mathtutorbtn.setBounds(50, 360, 250, 50);

        openunibtn.setText("open university maths study skills");
        openunibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openunibtnActionPerformed(evt);
            }
        });
        getContentPane().add(openunibtn);
        openunibtn.setBounds(50, 423, 250, 50);

        emailField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailField1ActionPerformed(evt);
            }
        });
        getContentPane().add(emailField1);
        emailField1.setBounds(110, 280, 200, 30);

        subjectField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectField2ActionPerformed(evt);
            }
        });
        getContentPane().add(subjectField2);
        subjectField2.setBounds(110, 340, 200, 30);

        sendBtn.setText("send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sendBtn);
        sendBtn.setBounds(200, 533, 110, 40);

        messagefield3.setColumns(20);
        messagefield3.setLineWrap(true);
        messagefield3.setRows(5);
        messagepane3.setViewportView(messagefield3);

        getContentPane().add(messagepane3);
        messagepane3.setBounds(110, 390, 200, 130);

        diagtxt.setColumns(20);
        diagtxt.setEditable(false);
        diagtxt.setLineWrap(true);
        diagtxt.setRows(5);
        diagtxt.setText("Diagnostic assessment is a simple and short quiz to give a general indication as to whether you might have math related difficulties or disabilities. if your score in the quiz is low it is reccomended you contact the disability office in the college to recieve further  diagnostic assesments.");
        diagtxt.setWrapStyleWord(true);
        diaginfo.setViewportView(diagtxt);

        getContentPane().add(diaginfo);
        diaginfo.setBounds(30, 246, 320, 140);

        mathcentrebtn.setText("math centre");
        mathcentrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathcentrebtnActionPerformed(evt);
            }
        });
        getContentPane().add(mathcentrebtn);
        mathcentrebtn.setBounds(50, 280, 250, 50);

        quizBtn.setText("Tap to Try the quiz ");
        quizBtn.setOpaque(false);
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quizBtn);
        quizBtn.setBounds(30, 423, 310, 40);

        appointmentBtn.setText("Tap to make an appointment");
        appointmentBtn.setOpaque(false);
        appointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(appointmentBtn);
        appointmentBtn.setBounds(30, 490, 310, 70);

        wkshptxt.setColumns(20);
        wkshptxt.setLineWrap(true);
        wkshptxt.setRows(5);
        wkshptxt.setText("The Mathematics Support Service has been running dedicated programme workshops since the start of Semester 2. These workshops are a great opportunity for all who attend to reafirm the concepts previously covered on your module. They are also a great place to ask questions and get advice.");
        wkshptxt.setWrapStyleWord(true);
        wkshpinfo.setViewportView(wkshptxt);

        getContentPane().add(wkshpinfo);
        wkshpinfo.setBounds(30, 250, 320, 140);

        onetooneBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        onetooneBtn.setText("<html>  one to one<br> <center>sessions </center>");
        onetooneBtn.setOpaque(false);
        onetooneBtn.setVerifyInputWhenFocusTarget(false);
        onetooneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetooneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(onetooneBtn);
        onetooneBtn.setBounds(110, 180, 90, 60);

        wkshpBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        wkshpBtn.setText("<html> workshops <br><center>& exams</center>");
        wkshpBtn.setOpaque(false);
        wkshpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wkshpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(wkshpBtn);
        wkshpBtn.setBounds(200, 180, 90, 60);

        DiagBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DiagBtn.setText("<html> Diagnostic <br><center>assesment</center>");
        DiagBtn.setOpaque(false);
        DiagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DiagBtn);
        DiagBtn.setBounds(290, 180, 80, 60);

        viewwkshpttBtn.setText("Tap here to view the workshop timetables");
        viewwkshpttBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewwkshpttBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewwkshpttBtn);
        viewwkshpttBtn.setBounds(30, 430, 310, 50);

        usefuldefBtn.setText("<html> Tap here for useful <center> Definitions ");
        usefuldefBtn.setActionCommand("<html> Tap here for useful <center> Definitions </center> (Coming Soon)");
        usefuldefBtn.setOpaque(false);
        usefuldefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usefuldefBtnActionPerformed(evt);
            }
        });
        getContentPane().add(usefuldefBtn);
        usefuldefBtn.setBounds(120, 380, 140, 90);

        usefuldeflbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usefuldeflbl.setText("<html> Glossary of useful defintions<br><center> for discrete and statistical mathematics</center>");
        getContentPane().add(usefuldeflbl);
        usefuldeflbl.setBounds(30, 250, 310, 44);

        jResplbl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jResplbl.setText("<html> The Mathematics Support Service is one of a number of services offered by the NCI Student Support Service.  The service provides an informal environment for students who are experiencing difficulties or wish to improve their understanding of and confidence in mathematical concepts.  In this section you will find a number of useful resources to aid you with your studies.    ");
        getContentPane().add(jResplbl);
        jResplbl.setBounds(70, 240, 260, 150);

        displaybtn.setText("Display");
        displaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybtnActionPerformed(evt);
            }
        });
        getContentPane().add(displaybtn);
        displaybtn.setBounds(60, 533, 100, 40);

        quizheaderlbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quizheaderlbl.setText("Do you have Dyscalculia?");

        dyscalquiz.setText("<html>Dyscalculia is a mathematics learning disability that is recognized by educators, psychologists and doctors across the world. It is sometimes jokingly called \"Math Dyslexia\" because those with this learning disability often transpose, omit and add numbers in a way that reminds people of mistakes commonly made by Dyslexics with letters and words.");

        q1lbl.setText("Q1 Do you have good reading, writing and verbal skills?");

        q1btngrp.add(q1nobtn);
        q1nobtn.setText("No");
        q1nobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1nobtnActionPerformed(evt);
            }
        });

        q1btngrp.add(q1yesbtn);
        q1yesbtn.setText("Yes");
        q1yesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1yesbtnActionPerformed(evt);
            }
        });

        q2lbl.setText("Q2 Are you poetic?");

        q3lbl.setText("Q3 Do you have trouble keeping track of time or telling time?");

        q4lbl.setText("Q4 When going to appointments, class or work, do you arrive on time?");

        q5lbl.setText("Q5 Can you do math in your head?");

        q6lbl.setText("Q6 Can you add, subtract, multiply and divide?");

        q7lbl.setText("<html>Q7 When working with numbers do you transpose,<br> omit, substitute or add digits? For example: 2,567 becomes 2,657 <br>or 256 or 2,267 or 25,667");

        q8lbl.setText("Q8 Are you able to make change?");

        q9lbl.setText("Q9 Do you learn a new math concept one day and forget it the next?");

        q10lbl.setText("Q10 Do you understand and remember rules, sequences and formulas?");

        q11lbl.setText("Q11 Are you good at picturing the numbers on the face of a clock?");

        q12lbl.setText("Q12 Do you have a good sense of direction?");

        qsubmitbtn.setText("submit");
        qsubmitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qsubmitbtnActionPerformed(evt);
            }
        });

        q2btngrp.add(q2yes);
        q2yes.setText("Yes");
        q2yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2yesActionPerformed(evt);
            }
        });

        q2btngrp.add(q2no);
        q2no.setText("No");
        q2no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2noActionPerformed(evt);
            }
        });

        q3btngrp.add(q3yes);
        q3yes.setText("Yes");
        q3yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3yesActionPerformed(evt);
            }
        });

        q3btngrp.add(q3no);
        q3no.setText("No");
        q3no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3noActionPerformed(evt);
            }
        });

        q4btngrp.add(q4yes);
        q4yes.setText("Yes");
        q4yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4yesActionPerformed(evt);
            }
        });

        q4btngrp.add(q4no);
        q4no.setText("No");
        q4no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4noActionPerformed(evt);
            }
        });

        q5btngrp.add(q5yes);
        q5yes.setText("Yes");
        q5yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5yesActionPerformed(evt);
            }
        });

        q5btngrp.add(q5no);
        q5no.setText("No");
        q5no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5noActionPerformed(evt);
            }
        });

        q6btngrp.add(q6yes);
        q6yes.setText("Yes");
        q6yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6yesActionPerformed(evt);
            }
        });

        q6btngrp.add(q6no);
        q6no.setText("No");
        q6no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6noActionPerformed(evt);
            }
        });

        q7btngrp.add(q7yes);
        q7yes.setText("Yes");
        q7yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q7yesActionPerformed(evt);
            }
        });

        q7btngrp.add(q7no);
        q7no.setText("No");
        q7no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q7noActionPerformed(evt);
            }
        });

        q8btngrp.add(q8yes);
        q8yes.setText("Yes");
        q8yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q8yesActionPerformed(evt);
            }
        });

        q8btngrp.add(q8no);
        q8no.setText("No");
        q8no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q8noActionPerformed(evt);
            }
        });

        q9btngrp.add(q9yes);
        q9yes.setText("Yes");
        q9yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q9yesActionPerformed(evt);
            }
        });

        q9btngrp.add(q9no);
        q9no.setText("No");
        q9no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q9noActionPerformed(evt);
            }
        });

        q10btngrp.add(q10yes);
        q10yes.setText("Yes");
        q10yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q10yesActionPerformed(evt);
            }
        });

        q10btngrp.add(q10no);
        q10no.setText("No");
        q10no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q10noActionPerformed(evt);
            }
        });

        q11btngrp.add(q11yes);
        q11yes.setText("Yes");
        q11yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q11yesActionPerformed(evt);
            }
        });

        q11btngrp.add(q11no);
        q11no.setText("No");
        q11no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q11noActionPerformed(evt);
            }
        });

        q12btngrp.add(q12yes);
        q12yes.setText("Yes");
        q12yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q12yesActionPerformed(evt);
            }
        });

        q12btngrp.add(q12no);
        q12no.setText("No");
        q12no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q12noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quizpnlLayout = new javax.swing.GroupLayout(quizpnl);
        quizpnl.setLayout(quizpnlLayout);
        quizpnlLayout.setHorizontalGroup(
            quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quizpnlLayout.createSequentialGroup()
                        .addComponent(q12yes)
                        .addGap(46, 46, 46)
                        .addComponent(q12no))
                    .addGroup(quizpnlLayout.createSequentialGroup()
                        .addComponent(q11yes)
                        .addGap(47, 47, 47)
                        .addComponent(q11no))
                    .addGroup(quizpnlLayout.createSequentialGroup()
                        .addComponent(q10yes)
                        .addGap(47, 47, 47)
                        .addComponent(q10no))
                    .addGroup(quizpnlLayout.createSequentialGroup()
                        .addComponent(q9yes)
                        .addGap(48, 48, 48)
                        .addComponent(q9no))
                    .addGroup(quizpnlLayout.createSequentialGroup()
                        .addComponent(q3yes)
                        .addGap(50, 50, 50)
                        .addComponent(q3no))
                    .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(quizheaderlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(dyscalquiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(q2lbl)
                    .addComponent(q5lbl)
                    .addComponent(q6lbl)
                    .addComponent(q7lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q8lbl)
                    .addComponent(q9lbl)
                    .addComponent(q10lbl)
                    .addComponent(q11lbl)
                    .addComponent(q12lbl)
                    .addComponent(qsubmitbtn)
                    .addGroup(quizpnlLayout.createSequentialGroup()
                        .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quizpnlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(q1yesbtn))
                            .addComponent(q2yes))
                        .addGap(51, 51, 51)
                        .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q2no)
                            .addComponent(q1nobtn)))
                    .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(quizpnlLayout.createSequentialGroup()
                            .addComponent(q6yes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q6no))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizpnlLayout.createSequentialGroup()
                            .addComponent(q5yes)
                            .addGap(52, 52, 52)
                            .addComponent(q5no))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizpnlLayout.createSequentialGroup()
                            .addComponent(q4yes)
                            .addGap(52, 52, 52)
                            .addComponent(q4no)))
                    .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(quizpnlLayout.createSequentialGroup()
                            .addComponent(q8yes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q8no))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizpnlLayout.createSequentialGroup()
                            .addComponent(q7yes)
                            .addGap(47, 47, 47)
                            .addComponent(q7no)))
                    .addComponent(q3lbl)
                    .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(q1lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(q4lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        quizpnlLayout.setVerticalGroup(
            quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizpnlLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(quizheaderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dyscalquiz, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1yesbtn)
                    .addComponent(q1nobtn))
                .addGap(30, 30, 30)
                .addComponent(q2lbl)
                .addGap(18, 18, 18)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2yes)
                    .addComponent(q2no))
                .addGap(30, 30, 30)
                .addComponent(q3lbl)
                .addGap(18, 18, 18)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3yes)
                    .addComponent(q3no))
                .addGap(35, 35, 35)
                .addComponent(q4lbl)
                .addGap(32, 32, 32)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4yes)
                    .addComponent(q4no))
                .addGap(18, 18, 18)
                .addComponent(q5lbl)
                .addGap(31, 31, 31)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5yes)
                    .addComponent(q5no))
                .addGap(28, 28, 28)
                .addComponent(q6lbl)
                .addGap(35, 35, 35)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q6yes)
                    .addComponent(q6no))
                .addGap(26, 26, 26)
                .addComponent(q7lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q7yes)
                    .addComponent(q7no))
                .addGap(32, 32, 32)
                .addComponent(q8lbl)
                .addGap(39, 39, 39)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q8yes)
                    .addComponent(q8no))
                .addGap(37, 37, 37)
                .addComponent(q9lbl)
                .addGap(40, 40, 40)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q9yes)
                    .addComponent(q9no))
                .addGap(27, 27, 27)
                .addComponent(q10lbl)
                .addGap(33, 33, 33)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q10yes)
                    .addComponent(q10no))
                .addGap(28, 28, 28)
                .addComponent(q11lbl)
                .addGap(40, 40, 40)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q11no)
                    .addComponent(q11yes))
                .addGap(26, 26, 26)
                .addComponent(q12lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(quizpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q12yes)
                    .addComponent(q12no))
                .addGap(33, 33, 33)
                .addComponent(qsubmitbtn)
                .addGap(73, 73, 73))
        );

        quizpane.setViewportView(quizpnl);

        getContentPane().add(quizpane);
        quizpane.setBounds(30, 240, 340, 340);

        onetoonearea.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ototxt.setColumns(20);
        ototxt.setEditable(false);
        ototxt.setLineWrap(true);
        ototxt.setRows(5);
        ototxt.setTabSize(10);
        ototxt.setText("One-to-one sessions can be organized for students who have significant trouble in mathematic concepts.\n To avail of One-to-one sessions you can contact our resident Mathematics Development and Support Officer Jonathan Lambert through either phone or email.\n Contact: Jonathan Lambert Mathematics Development and Support Officer  Phone: 01 4498650 Email: jonathan.lambert@ncirl.ie \n If you wish to make an enquiry or appointment you can also send a message by tapping below.");
        ototxt.setWrapStyleWord(true);
        onetoonearea.setViewportView(ototxt);

        getContentPane().add(onetoonearea);
        onetoonearea.setBounds(30, 250, 320, 150);

        alphabtn.setText("α (alpha) ");
        alphabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphabtnActionPerformed(evt);
            }
        });

        Althypbtn.setText("Alternative Hypothesis ");
        Althypbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlthypbtnActionPerformed(evt);
            }
        });

        anlvarybtn.setText("Analysis of Variance (ANOVA) ");
        anlvarybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anlvarybtnActionPerformed(evt);
            }
        });

        avdevbtn.setText("Average Deviation");
        avdevbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avdevbtnActionPerformed(evt);
            }
        });

        betabtn.setText("β (beta) ");
        betabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betabtnActionPerformed(evt);
            }
        });

        ctrllimittheobtn.setText("Central Limit Theorem ");
        ctrllimittheobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrllimittheobtnActionPerformed(evt);
            }
        });

        x2btn.setText("χ² (Chi-Square) ");
        x2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2btnActionPerformed(evt);
            }
        });

        confacbtn.setText("Confounding Factor");
        confacbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confacbtnActionPerformed(evt);
            }
        });

        corcoe.setText("Correlation Coefficient ");
        corcoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corcoeActionPerformed(evt);
            }
        });

        critregbtn.setText("Critical Region ");
        critregbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                critregbtnActionPerformed(evt);
            }
        });

        dfbtn.setText("Degrees of Freedom (df) ");
        dfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfbtnActionPerformed(evt);
            }
        });

        statfbtn.setText("The Statistic F ");
        statfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statfbtnActionPerformed(evt);
            }
        });

        ftestbtn.setText("F Test ");
        ftestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftestbtnActionPerformed(evt);
            }
        });

        histogbtn.setText("Histogram ");
        histogbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogbtnActionPerformed(evt);
            }
        });

        meanbtn.setText("Mean ");
        meanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meanbtnActionPerformed(evt);
            }
        });

        meansqbtn.setText("Mean Square");
        meansqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meansqbtnActionPerformed(evt);
            }
        });

        medianbtn.setText("Median ");
        medianbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianbtnActionPerformed(evt);
            }
        });

        modebtn.setText("Mode");
        modebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modebtnActionPerformed(evt);
            }
        });

        nullhypobtn.setText("Null Hypothesis ");
        nullhypobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nullhypobtnActionPerformed(evt);
            }
        });

        onetailtbtn.setText("One-Tailed Test ");
        onetailtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetailtbtnActionPerformed(evt);
            }
        });

        parambtn.setText("Parameter ");
        parambtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parambtnActionPerformed(evt);
            }
        });

        popbtn.setText("Population ");
        popbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popbtnActionPerformed(evt);
            }
        });

        powbtn.setText("Power ");
        powbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powbtnActionPerformed(evt);
            }
        });

        predbtn.setText("Relationship between α, β & Power ");
        predbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predbtnActionPerformed(evt);
            }
        });

        randsampbtn.setText("Prediction ");
        randsampbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randsampbtnActionPerformed(evt);
            }
        });

        rangebtn.setText("Random Sample ");
        rangebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangebtnActionPerformed(evt);
            }
        });

        regrebtn.setText("Range ");
        regrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrebtnActionPerformed(evt);
            }
        });

        regtomeanbtn.setText("Regression ");
        regtomeanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regtomeanbtnActionPerformed(evt);
            }
        });

        relatemeabtn.setText("Regression Toward the Mean ");
        relatemeabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatemeabtnActionPerformed(evt);
            }
        });

        sampmeanxbtn.setText("Sample Mean (X Bar) ");
        sampmeanxbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampmeanxbtnActionPerformed(evt);
            }
        });

        sampdistbtn.setText("Sampling Distribution ");
        sampdistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampdistbtnActionPerformed(evt);
            }
        });

        s2btn.setText("s² ");
        s2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2btnActionPerformed(evt);
            }
        });

        standdevbtn.setText("Standard Deviation ");
        standdevbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standdevbtnActionPerformed(evt);
            }
        });

        standerrbtn.setText("Standard Error ");
        standerrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standerrbtnActionPerformed(evt);
            }
        });

        stasticbtn.setText("Statistic ");
        stasticbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stasticbtnActionPerformed(evt);
            }
        });

        stathypbtn.setText("Statistical Hypothesis");
        stathypbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stathypbtnActionPerformed(evt);
            }
        });

        statsigbtn.setText("Statistical Significance");
        statsigbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsigbtnActionPerformed(evt);
            }
        });

        stattestbtn.setText("Statistical Test ");
        stattestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stattestbtnActionPerformed(evt);
            }
        });

        sumofsqbtn.setText("Sum of Squares ");
        sumofsqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumofsqbtnActionPerformed(evt);
            }
        });

        stattbtn.setText("The Statistic t ");
        stattbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stattbtnActionPerformed(evt);
            }
        });

        ttestbtn.setText("t Test ");
        ttestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttestbtnActionPerformed(evt);
            }
        });

        transrulebtn.setText("Transformation Rules ");
        transrulebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transrulebtnActionPerformed(evt);
            }
        });

        twotailtestbtn.setText("Two-tailed Test ");
        twotailtestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twotailtestbtnActionPerformed(evt);
            }
        });

        typeierbtn.setText("Type I Error ");
        typeierbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeierbtnActionPerformed(evt);
            }
        });

        typeiierbtn.setText("Type II Error ");
        typeiierbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeiierbtnActionPerformed(evt);
            }
        });

        unbiasestbtn.setText("Unbiased Estimate (→) ");
        unbiasestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unbiasestbtnActionPerformed(evt);
            }
        });

        varibtn.setText("Variance ");
        varibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varibtnActionPerformed(evt);
            }
        });

        statzbtn.setText("The Statistic Z ");
        statzbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statzbtnActionPerformed(evt);
            }
        });

        zscorebtn.setText("Z Score");
        zscorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zscorebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout definitionpanelLayout = new javax.swing.GroupLayout(definitionpanel);
        definitionpanel.setLayout(definitionpanelLayout);
        definitionpanelLayout.setHorizontalGroup(
            definitionpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(definitionpanelLayout.createSequentialGroup()
                .addGroup(definitionpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alphabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avdevbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctrllimittheobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confacbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corcoe, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(critregbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histogbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meansqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medianbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nullhypobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onetailtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parambtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randsampbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rangebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regtomeanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relatemeabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(predbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampmeanxbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampdistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standdevbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standerrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stasticbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stathypbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsigbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stattestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumofsqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stattbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transrulebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twotailtestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeierbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeiierbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unbiasestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statzbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zscorebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(definitionpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(anlvarybtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Althypbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        definitionpanelLayout.setVerticalGroup(
            definitionpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(definitionpanelLayout.createSequentialGroup()
                .addComponent(alphabtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Althypbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anlvarybtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avdevbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(betabtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctrllimittheobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(x2btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confacbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corcoe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(critregbtn)
                .addGap(33, 33, 33)
                .addComponent(dfbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statfbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftestbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(histogbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meanbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meansqbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medianbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modebtn)
                .addGap(35, 35, 35)
                .addComponent(nullhypobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onetailtbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parambtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popbtn)
                .addGap(5, 5, 5)
                .addComponent(powbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randsampbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rangebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regrebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regtomeanbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatemeabtn)
                .addGap(35, 35, 35)
                .addComponent(predbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sampmeanxbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sampdistbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(standdevbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(standerrbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stasticbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stathypbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statsigbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stattestbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sumofsqbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stattbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttestbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transrulebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twotailtestbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeierbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeiierbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unbiasestbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varibtn)
                .addGap(35, 35, 35)
                .addComponent(statzbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zscorebtn))
        );

        definitionpane.setViewportView(definitionpanel);

        getContentPane().add(definitionpane);
        definitionpane.setBounds(30, 350, 330, 230);

        timetablelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/BSHC1B SEM2.png"))); // NOI18N

        javax.swing.GroupLayout timetablepnlLayout = new javax.swing.GroupLayout(timetablepnl);
        timetablepnl.setLayout(timetablepnlLayout);
        timetablepnlLayout.setHorizontalGroup(
            timetablepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timetablepnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timetablelbl)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        timetablepnlLayout.setVerticalGroup(
            timetablepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timetablepnlLayout.createSequentialGroup()
                .addComponent(timetablelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 2441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 142, Short.MAX_VALUE))
        );

        timetablepane.setViewportView(timetablepnl);

        getContentPane().add(timetablepane);
        timetablepane.setBounds(20, 242, 350, 350);

        alphaarea.setColumns(20);
        alphaarea.setLineWrap(true);
        alphaarea.setRows(5);
        alphaarea.setText("Statisticians use the Greek letter α (alpha) to indicate the probability of rejecting the statistical hypothesis tested when, in fact, that hypothesis is true. Before conducting any statistical test it is important to establish a value for α. For most psychologists, and for many other scientists, it is customary to set α at 0.05.\n\nThis is the equivalent of asserting that you will reject the hypothesis tested if the obtained statistic is among those that would occur only 5 out of 100 times that random samples are drawn from a population in which the hypothesis is true. If your obtained statistic leads you to reject the hypothesis tested, it's not because you believe that the obtained statistic could not have occurred by chance.\n\nIt's that you are asserting that the odds of obtaining that statistic by chance only are sufficiently low (one out of twenty) that it's reasonable to conclude that your results are not due to chance. Could you be in error? Of course you could, but at least you know the probability of such an error. It is exactly equal to the value you have previously established for α.");
        alphapane.setViewportView(alphaarea);

        getContentPane().add(alphapane);
        alphapane.setBounds(20, 240, 360, 360);

        althyparea.setColumns(20);
        althyparea.setLineWrap(true);
        althyparea.setRows(5);
        althyparea.setText("The test of a given statistical hypothesis entails an assessment of whether or not our sample (or samples) have yielded a statistic that is among those cases that would only occur α proportion of the time if the hypothesis tested is true.\n\nIn these circumstances we know the probability of rejecting the hypothesis tested when it is true (that probability is equal to α) but unless we have also specified an alternative hypothesis to the hypothesis tested, we have no idea of the probability of being in error, if our test has failed to yield a value that enables us to reject the hypothesis tested.");
        althyparea.setWrapStyleWord(true);
        althyppane.setViewportView(althyparea);

        getContentPane().add(althyppane);
        althyppane.setBounds(20, 240, 350, 350);

        anlvararea.setColumns(20);
        anlvararea.setLineWrap(true);
        anlvararea.setRows(5);
        anlvararea.setWrapStyleWord(true);
        anlvarpane.setViewportView(anlvararea);

        getContentPane().add(anlvarpane);
        anlvarpane.setBounds(20, 240, 350, 350);

        avdevarea.setColumns(20);
        avdevarea.setLineWrap(true);
        avdevarea.setRows(5);
        avdevarea.setText("The average deviation is one of several indices of variability that statisticians use to characterize the dispersion among the measures in a given population.\n\nTo calculate the average deviation of a set of scores it is first necessary to compute their mean and then specify the distance between each score and that mean without regard to whether the score is above or below the mean. The average deviation is defined as the mean of these absolute values.");
        avdevarea.setWrapStyleWord(true);
        avdevpane.setViewportView(avdevarea);

        getContentPane().add(avdevpane);
        avdevpane.setBounds(20, 240, 350, 350);

        betaarea.setColumns(20);
        betaarea.setLineWrap(true);
        betaarea.setRows(5);
        betaarea.setText("Statisticians use the Greek letter ß (beta) to indicate the probability of failing to reject the hypothesis tested when that hypothesis is false and a specific alternative hypothesis is true. For a given test, the value of ß is determined by the previously selected value of α (alpha), certain features of the statistic that is being calculated (particularly the sample size) and the specific alternative hypothesis that is being entertained.\n\nWhile it is possible to carry out a statistical test without entertaining a specific alternative hypothesis, neither ß nor power can be calculated if there is no specific alternative hypothesis. It is relevant to note here that power (the probability that the test will reject the hypothesis tested when a specific alternative hypothesis is true) is always equal to one minus ß (i.e. Power = 1 - ß).");
        betaarea.setWrapStyleWord(true);
        betapane.setViewportView(betaarea);

        getContentPane().add(betapane);
        betapane.setBounds(20, 240, 350, 350);

        ctrllmtarea.setColumns(20);
        ctrllmtarea.setLineWrap(true);
        ctrllmtarea.setRows(5);
        ctrllmtarea.setText("The Central Limit Theorem is a statement about the characteristics of the sampling distribution of means of random samples from a given population. That is, it describes the characteristics of the distribution of values we would obtain if we were able to draw an infinite number of random samples of a given size from a given population and we calculated the mean of each sample.\n\nThe Central Limit Theorem consists of three statements:\n\n[1] The mean of the sampling distribution of means is equal to the mean of the population from which the samples were drawn.\n[2] The variance of the sampling distribution of means is equal to the variance of the population from which the samples were drawn divided by the size of the samples.\n\n[3] If the original population is distributed normally (i.e. it is bell shaped), the sampling distribution of means will also be normal. If the original population is not normally distributed, the sampling distribution of means will increasingly approximate a normal distribution as sample size increases (i.e. when increasingly large samples are drawn).");
        ctrllmtarea.setWrapStyleWord(true);
        Ctrllmttheopane.setViewportView(ctrllmtarea);

        getContentPane().add(Ctrllmttheopane);
        Ctrllmttheopane.setBounds(20, 240, 350, 350);

        x2area.setColumns(20);
        x2area.setLineWrap(true);
        x2area.setRows(5);
        x2area.setText("The statistic Chi Square (χ²) is what statisticians call an enumeration statistic. Rather than measuring the value of each of a set of items, a calculated value of Chi Square compares the frequencies of various kinds (or categories) of items in a random sample to the frequencies that are expected if the population frequencies are as hypothesized by the investigator.\n\nChi Square is often used to assess the \"goodness of fit\" between an obtained set of frequencies in a random sample and what is expected under a given statistical hypothesis. For example, Chi Square can be used to determine if there is reason to reject the statistical hypothesis that the frequencies in a random sample are as expected when the items are from a normal distribution.\n\nIn the equation shown below, O and E are Observed and Expected frequencies in each category.");
        x2area.setWrapStyleWord(true);
        x2pane.setViewportView(x2area);

        getContentPane().add(x2pane);
        x2pane.setBounds(20, 240, 350, 350);

        confactarea.setColumns(20);
        confactarea.setLineWrap(true);
        confactarea.setRows(5);
        confactarea.setText("In a well designed psychology experiment an investigator will randomly assign subjects to two or more groups and except for differences in the experimental procedure applied to each group, the groups will be treated exactly alike. Under these circumstances any differences between the groups that are statistically significant are attributed to differences in the treatment conditions. This, of course assumes that except for the various treatment conditions the groups were, in fact, treated exactly alike.\n\nUnfortunately, however, it is always possible that despite an experimenter's best intentions there were some unsuspected systematic differences in the way the groups were treated in addition to the intended treatment conditions. Statisticians describe systematic differences of this sort as confounding factors or confounding variables.\n\nIf, for example, subjects in one group are simultaniously tested in a room with the heat set at 70 degrees whereas subjects in another group are simultaniously tested in a nearby identically appointed room with the heat set at 60 degrees, the obtained differences in performance could be attributed to any of three factors. It could be due to the random assignment of subjects (i.e. to chance). It could be due to the different temperatures in the two rooms. It could, however, be due to some confounding factor such as differences in ambient illumination that result from unnoticed differences in the orientation of each room with respect to the sun. In any experiment an appropriate statistical test can help in the decision as to whether or not to attribute the results to chance, but only the most careful analysis of the actual conditions of the experiment can suggest whether or not the results might be due to a confounding factor.");
        confactarea.setWrapStyleWord(true);
        confactpane.setViewportView(confactarea);

        getContentPane().add(confactpane);
        confactpane.setBounds(30, 240, 340, 350);

        corlcoefarea.setEditable(false);
        corlcoefarea.setColumns(20);
        corlcoefarea.setLineWrap(true);
        corlcoefarea.setRows(5);
        corlcoefarea.setText("Given a pair of related measures (X and Y) on each of a set of items, the correlation coefficient (r) provides an index of the degree to which the paired measures co-vary in a linear fashion. In general r will be positive when items with large values of X also tend to have large values of Y whereas items with small values of X tend to have small values of Y. Correspondingly, r will be negative when items with large values of X tend to have small values of Y whereas items with small values of X tend to have large values of Y. The value of r is calculated by first converting the Xs and Ys into their respective Z Scores and, keeping track of which Z Score goes with which item, determining the value of the mean Z Score product. Numerically, r can assume any value between -1 and +1 depending upon the degree of the relationship. Plus and minus one indicate perfect positive and negative relationships whereas zero indicates that the X and Y values do not co-vary in any linear fashion.");
        corlcoefarea.setWrapStyleWord(true);
        corlcoefpane.setViewportView(corlcoefarea);

        getContentPane().add(corlcoefpane);
        corlcoefpane.setBounds(20, 240, 350, 350);

        critregarea.setEditable(false);
        critregarea.setColumns(20);
        critregarea.setLineWrap(true);
        critregarea.setRows(5);
        critregarea.setText("The critical region of the sampling distribution of a statistic is also known as the α region.\n\nIt is the area, or areas, of the sampling distribution of a statistic that will lead to the rejection of the hypothesis tested when that hypothesis is true.");
        critregarea.setWrapStyleWord(true);
        critregpane.setViewportView(critregarea);

        getContentPane().add(critregpane);
        critregpane.setBounds(20, 240, 350, 350);

        dfarea.setEditable(false);
        dfarea.setColumns(20);
        dfarea.setLineWrap(true);
        dfarea.setRows(5);
        dfarea.setText("Statisticians use the terms \"degrees of freedom\" to describe the number of values in the final calculation of a statistic that are free to vary. Consider, for example the statistic s².\n\nTo calculate the s² of a random sample, we must first calculate the mean of that sample and then compute the sum of the several squared deviations from that mean. While there will be n such squared deviations only (n - 1) of them are, in fact, free to assume any value whatsoever. This is because the final squared deviation from the mean must include the one value of X such that the sum of all the Xs divided by n will equal the obtained mean of the sample. All of the other (n - 1) squared deviations from the mean can, theoretically, have any values whatsoever. For these reasons, the statistic s² is said to have only (n - 1) degrees of freedom.");
        dfarea.setWrapStyleWord(true);
        dfpane.setViewportView(dfarea);

        getContentPane().add(dfpane);
        dfpane.setBounds(20, 240, 166, 96);

        statfarea.setEditable(false);
        statfarea.setColumns(20);
        statfarea.setLineWrap(true);
        statfarea.setRows(5);
        statfarea.setText("Named for the great statistician R. A. Fisher, the statistic (F) is the ratio of two s²'s (i.e. estimates of a population variance, based on the information in two or more random samples).\n\nWhen employed in the procedure entitled ANOVA, the obtained value of F provides a test for the statistical significance of the observed differences among the means of two or more random samples.");
        statfarea.setWrapStyleWord(true);
        statfpane.setViewportView(statfarea);

        getContentPane().add(statfpane);
        statfpane.setBounds(20, 240, 350, 350);

        ftestarea.setEditable(false);
        ftestarea.setColumns(20);
        ftestarea.setLineWrap(true);
        ftestarea.setRows(5);
        ftestarea.setText("Named for the great statistician R. A. Fisher, the statistic (F) is the ratio of two s²'s (i.e. estimates of a population variance, based on the information in two or more random samples).\n\nWhen employed in the procedure entitled ANOVA, the obtained value of F provides a test for the statistical significance of the observed differences among the means of two or more random samples.");
        ftestarea.setWrapStyleWord(true);
        ftestpane.setViewportView(ftestarea);

        getContentPane().add(ftestpane);
        ftestpane.setBounds(20, 240, 350, 350);

        histogarea.setEditable(false);
        histogarea.setColumns(20);
        histogarea.setLineWrap(true);
        histogarea.setRows(5);
        histogarea.setText("Named for the great statistician R. A. Fisher, the statistic (F) is the ratio of two s²'s (i.e. estimates of a population variance, based on the information in two or more random samples).\n\nWhen employed in the procedure entitled ANOVA, the obtained value of F provides a test for the statistical significance of the observed differences among the means of two or more random samples.");
        histogarea.setWrapStyleWord(true);
        histogpane.setViewportView(histogarea);

        getContentPane().add(histogpane);
        histogpane.setBounds(20, 240, 350, 350);

        meanarea.setEditable(false);
        meanarea.setColumns(20);
        meanarea.setLineWrap(true);
        meanarea.setRows(5);
        meanarea.setText("The mean () is one of several indices of central tendency that statisticians use to indicate the point on the scale of measures where the population is centered.\n\nThe mean is the average of the scores in the population. Numerically, it equals the sum of the scores divided by the number of scores. It is of interest that the mean is the one value which, if substituted for every score in a population, would yield the same sum as the original scores, and hence it would yield the same mean.\n\nThis illustration shows a population of 9 persons. It also shows the height of each person as well as the formula and calculations of the mean of the population. As is customary, we have used the Greek letter μ (mu) to represent the mean of a population.");
        meanarea.setWrapStyleWord(true);
        meanpane.setViewportView(meanarea);

        getContentPane().add(meanpane);
        meanpane.setBounds(20, 240, 350, 350);

        meansqarea.setEditable(false);
        meansqarea.setColumns(20);
        meansqarea.setLineWrap(true);
        meansqarea.setRows(5);
        meansqarea.setText("The mean  is one of several indices of central tendency that statisticians use to indicate the point on the scale of measures where the population is centered.\n\nThe mean is the average of the scores in the population. Numerically, it equals the sum of the scores divided by the number of scores. It is of interest that the mean is the one value which, if substituted for every score in a population, would yield the same sum as the original scores, and hence it would yield the same mean.\n\nThis illustration shows a population of 9 persons. It also shows the height of each person as well as the formula and calculations of the mean of the population. As is customary, we have used the Greek letter μ (mu) to represent the mean of a population.");
        meansqarea.setWrapStyleWord(true);
        meansqpane.setViewportView(meansqarea);

        getContentPane().add(meansqpane);
        meansqpane.setBounds(20, 240, 350, 350);

        medianarea.setEditable(false);
        medianarea.setColumns(20);
        medianarea.setLineWrap(true);
        medianarea.setRows(5);
        medianarea.setText("In an ANOVA, the term Mean Square refers to an estimate of the population variance based on the variability among a given set of measures.\n\nIn a one way ANOVA, the Within Mean Square is an estimate of the population variance based on the average of all s²s within the several samples.\n\nIn a one way ANOVA the Between Mean Square is an estimate of the population variance based on the s² of the sample means multiplied by n (the size of the samples).");
        medianarea.setWrapStyleWord(true);
        medianpane.setViewportView(medianarea);

        getContentPane().add(medianpane);
        medianpane.setBounds(20, 240, 350, 350);

        modearea.setEditable(false);
        modearea.setColumns(20);
        modearea.setLineWrap(true);
        modearea.setRows(5);
        modearea.setText("In an ANOVA, the term Mean Square refers to an estimate of the population variance based on the variability among a given set of measures.\n\nIn a one way ANOVA, the Within Mean Square is an estimate of the population variance based on the average of all s²s within the several samples.\n\nIn a one way ANOVA the Between Mean Square is an estimate of the population variance based on the s² of the sample means multiplied by n (the size of the samples).");
        modearea.setWrapStyleWord(true);
        modepane.setViewportView(modearea);

        getContentPane().add(modepane);
        modepane.setBounds(20, 240, 350, 350);

        nullhyparea.setEditable(false);
        nullhyparea.setColumns(20);
        nullhyparea.setLineWrap(true);
        nullhyparea.setRows(5);
        nullhyparea.setText("The null hypothesis is a term that statisticians often use to indicate the statistical hypothesis tested. The purpose of most statistical tests, is to determine if the obtained results provide a reason to reject the hypothesis that they are merely a product of chance factors. For example, in an experiment in which two groups of randomly selected subjects have received different treatments and have yielded different means, it is always necessary to ask if the difference between the obtained means is among the differences that would be expected to occur by chance whenever two groups are randomly selected. In this example, the hypothesis tested is that the two samples are from populations with the same mean. Another way to say this is to assert that the investigator tests the null hypothesis that the difference between the means of the populations from which the samples were drawn, is zero. If the difference between the means of the samples is among those that would occur rarely by chance when the null hypothesis is true, the null hypothesis is rejected and the investigator describes the results as statistically significant.");
        nullhyparea.setWrapStyleWord(true);
        nullhyppane.setViewportView(nullhyparea);

        getContentPane().add(nullhyppane);
        nullhyppane.setBounds(20, 240, 350, 350);

        ottarea.setEditable(false);
        ottarea.setColumns(20);
        ottarea.setLineWrap(true);
        ottarea.setRows(5);
        ottarea.setText("The test of a given statistical hypothesis in which only a value of the statistic that is, for example, sufficiently large will lead to rejection of the hypothesis tested.");
        ottarea.setWrapStyleWord(true);
        ottpane.setViewportView(ottarea);

        getContentPane().add(ottpane);
        ottpane.setBounds(20, 240, 350, 350);

        paramarea.setEditable(false);
        paramarea.setColumns(20);
        paramarea.setLineWrap(true);
        paramarea.setRows(5);
        paramarea.setText("A parameter is a measurement on a population that characterizes one of its features. An example of a parameter is the mode. The mode is the value in the population that occurs most frequently. Other examples of parameters are a population's mean (or average) and its variance.");
        paramarea.setWrapStyleWord(true);
        parampane.setViewportView(paramarea);

        getContentPane().add(parampane);
        parampane.setBounds(20, 240, 350, 350);

        poparea.setEditable(false);
        poparea.setColumns(20);
        poparea.setLineWrap(true);
        poparea.setRows(5);
        poparea.setText("Statisticians define a population as the entire collection of items that is the focus of concern. The branch of Statistics called Descriptive Statistics, provides us with ways to describe the characteristics of a given population by measuring each of its items and then summarizing the set of measures in various ways.\n\nThe branch of Statistics called Inferential Statistics consists of procedures to make educated inferences about the characteristics of a population by drawing a random sample and appropriately analyzing the information it provides.\n\nA population can be of any size and while the items need not be uniform, the items must share at least one measurable feature. For example here is a population of 9 persons. While no two of the persons are identical they have many features in common. Each of the persons in this population has a weight, a height, a hat size and a shoe size, among many other potential features. The set of 9 measurements of any one of these features would, in statistical terms, be defined as a population.\n\nThe critical difference between a population and a sample, is that with a population our interest is to identify its characteristics whereas with a sample, our interest is to make inferences about the characteristics of the population from which the sample was drawn.\n\nIt is noteworthy that while the illustrated population is fairly small, it contains only 9 items, a different population might be extremely large. It might, for example, consist of all of the persons in a given city, country, planet, or even universe.");
        poparea.setWrapStyleWord(true);
        poppane.setViewportView(poparea);

        getContentPane().add(poppane);
        poppane.setBounds(20, 240, 350, 350);

        powerarea.setEditable(false);
        powerarea.setColumns(20);
        powerarea.setLineWrap(true);
        powerarea.setRows(5);
        powerarea.setText("For a statistician, the power of a test is the probability that the test will reject the hypothesis tested when a specific alternative hypothesis is true. To calculate the power of a given test it is necessary to specify α (alpha, i.e., the probability that the test will lead to the rejection of the hypothesis tested when that hypothesis is true) and to specify a specific alternative hypothesis.");
        powerarea.setWrapStyleWord(true);
        powerpane.setViewportView(powerarea);

        getContentPane().add(powerpane);
        powerpane.setBounds(20, 240, 350, 350);

        predictarea.setEditable(false);
        predictarea.setColumns(20);
        predictarea.setLineWrap(true);
        predictarea.setRows(5);
        predictarea.setText("In the concept of regression, the regression line indicates the predicted value of Y for each value of X.");
        predictarea.setWrapStyleWord(true);
        predictpane.setViewportView(predictarea);

        getContentPane().add(predictpane);
        predictpane.setBounds(20, 240, 350, 350);

        randsamparea.setEditable(false);
        randsamparea.setColumns(20);
        randsamparea.setLineWrap(true);
        randsamparea.setRows(5);
        randsamparea.setText("In statistical terms a random sample is a set of items that have been drawn from a population in such a way that each time an item was selected, every item in the population had an equal opportunity to appear in the sample. In practical terms, it is not so easy to draw a random sample. First, the only factor operating when a given item is selected, must be chance.\n\nIf, for example, numbered pieces of cardboard are drawn from a hat, it is important that they be thoroughly mixed, that they be identical in every respect except for the number printed on them and that the person selecting them be well blindfolded.\n\nSecond, in order to meet the equal opportunity requirement, it is important that the sampling be done with replacement. That is, each time an item is selected, the relevant measure is taken and recorded. Then the item must be replaced in the population and be thoroughly mixed with the other items before the next item is drawn. If the items are not replaced in the population, each time an item is withdrawn, the probability of being selected, for each of the remaining items, will have been increased.\n\nFor example, with the illustrated population, the initial probability that a given item will be selected is 1/9. If, however, an item is drawn and not returned before drawing a second item, the probability that a given item will be drawn will have been increased to 1/8. Of course, this kind of change in probability becomes trivial if our population is very large, but it is important to recognize the principle illustrated here, to fully understand the concept of a random sample.\n\nIt is also important to recognize that when sampling with replacement, it is possible for the same item to appear more than once in a sample and it is possible to draw a random sample that is larger than the population from which it came. Notice also, that it is possible to draw as many random samples as we like from a give population. The key idea here is that we either sample with replacement or we draw our samples from a population that is so large that the withdrawal of successive items changes probability by an amount that is too small to be of concern.");
        randsamparea.setWrapStyleWord(true);
        randsamppane.setViewportView(randsamparea);

        getContentPane().add(randsamppane);
        randsamppane.setBounds(20, 240, 350, 350);

        rangearea.setEditable(false);
        rangearea.setColumns(20);
        rangearea.setLineWrap(true);
        rangearea.setRows(5);
        rangearea.setText("The range is one of several indices of variability that statisticians use to characterize the dispersion among the measures in a given population.\n\nThe range is the distance between the highest and lowest score. Numerically, the range equals the highest score minus the lowest score.");
        rangearea.setWrapStyleWord(true);
        rangepane.setViewportView(rangearea);

        getContentPane().add(rangepane);
        rangepane.setBounds(20, 240, 350, 350);

        regarea.setEditable(false);
        regarea.setColumns(20);
        regarea.setLineWrap(true);
        regarea.setRows(5);
        regarea.setText("The range is one of several indices of variability that statisticians use to characterize the dispersion among the measures in a given population.\n\nThe range is the distance between the highest and lowest score. Numerically, the range equals the highest score minus the lowest score.");
        regarea.setWrapStyleWord(true);
        regpane.setViewportView(regarea);

        getContentPane().add(regpane);
        regpane.setBounds(20, 240, 350, 350);

        regtomeanarea.setEditable(false);
        regtomeanarea.setColumns(20);
        regtomeanarea.setLineWrap(true);
        regtomeanarea.setRows(5);
        regtomeanarea.setText("Regression toward the mean is a property of any scatterplot where the linear relationship is less than perfect. Under such circumstances the regression of Y on X will have a slope that is less than 45 degrees.\n\nAs a result, the mean of the values of Y for a given value of X will be closer to the mean of all values of Y than that value of X is to the mean of all the values of X.\n\nIn the scatterplot shown below, each dot represents the height of a father and the height of his son plotted together.");
        regtomeanarea.setWrapStyleWord(true);
        regtomeanpane.setViewportView(regtomeanarea);

        getContentPane().add(regtomeanpane);
        regtomeanpane.setBounds(20, 240, 350, 360);

        relatedmeasurearea.setEditable(false);
        relatedmeasurearea.setColumns(20);
        relatedmeasurearea.setLineWrap(true);
        relatedmeasurearea.setRows(5);
        relatedmeasurearea.setText("With any set of items (for example the population of 9 persons we have discussed elsewhere) we could, if we chose to, measure more than one feature. We could, for example, measure each person's weight as well as their height. The population of paired numbers would be described as related measures provided that we always knew which weight was related to which height. That is, we always associated the weight of a given person with that same person's height.");
        relatedmeasurearea.setWrapStyleWord(true);
        relatedmeasurepane.setViewportView(relatedmeasurearea);

        getContentPane().add(relatedmeasurepane);
        relatedmeasurepane.setBounds(20, 240, 350, 350);

        sampmeanxbararea.setEditable(false);
        sampmeanxbararea.setColumns(20);
        sampmeanxbararea.setLineWrap(true);
        sampmeanxbararea.setRows(5);
        sampmeanxbararea.setText("The Sampling Distribution of a statistic is the set of values that we would obtain if we drew an infinite number of random samples from a given population and calculated the statistic on each sample. In doing so, all samples must be of the same size (n). While it is not possible for anyone to actually draw an infinite number of samples, the concept of a sampling distribution can be understood by taking the time to carefully consider the following theoretical exercise.\n\nImagine that our population consists of only three numbers: the number 2, the number 3 and the number 4. Our plan is to draw an infinite number of random samples of size n = 2 and form a sampling distribution of the sample means.");
        sampmeanxbararea.setWrapStyleWord(true);
        sampmeanxbarpane.setViewportView(sampmeanxbararea);

        getContentPane().add(sampmeanxbarpane);
        sampmeanxbarpane.setBounds(20, 240, 350, 350);

        sampdistarea.setEditable(false);
        sampdistarea.setColumns(20);
        sampdistarea.setLineWrap(true);
        sampdistarea.setRows(5);
        sampdistarea.setText("The Sampling Distribution of a statistic is the set of values that we would obtain if we drew an infinite number of random samples from a given population and calculated the statistic on each sample. In doing so, all samples must be of the same size (n). While it is not possible for anyone to actually draw an infinite number of samples, the concept of a sampling distribution can be understood by taking the time to carefully consider the following theoretical exercise.\n\nImagine that our population consists of only three numbers: the number 2, the number 3 and the number 4. Our plan is to draw an infinite number of random samples of size n = 2 and form a sampling distribution of the sample means.");
        sampdistarea.setWrapStyleWord(true);
        sampdistpane.setViewportView(sampdistarea);

        getContentPane().add(sampdistpane);
        sampdistpane.setBounds(20, 240, 350, 350);

        s2area.setEditable(false);
        s2area.setColumns(20);
        s2area.setLineWrap(true);
        s2area.setRows(5);
        s2area.setText("The statistic s² is a measure on a random sample that is used to estimate the variance of the population from which the sample is drawn.\n\nNumerically, it is the sum of the squared deviations around the mean of a random sample divided by the sample size minus one.\n\nRegardless of the size of the population, and regardless of the size of the random sample, it can be algebriacally shown that if we repeatedly took random samples of the same size from the same population and calculated the variance estimate on each sample, these values would cluster around the exact value of the population variance. In short, the statistic s² is an unbiased estimate of the variance of the population from which a sample is drawn.\n\nThe illustration shows the formula for the calculation of s² and it provides an example of its calculation. It is a useful exercise to carry out these calculations by oneself.");
        s2area.setWrapStyleWord(true);
        s2pane.setViewportView(s2area);

        getContentPane().add(s2pane);
        s2pane.setBounds(20, 240, 350, 350);

        standdevarea.setEditable(false);
        standdevarea.setColumns(20);
        standdevarea.setLineWrap(true);
        standdevarea.setRows(5);
        standdevarea.setText("The standard deviation is one of several indices of variability that statisticians use to characterize the dispersion among the measures in a given population.\n\nTo calculate the standard deviation of a population it is first necessary to calculate that population's variance. Numerically, the standard deviation is the square root of the variance. Unlike the variance, which is a somewhat abstract measure of variability, the standard deviation can be readily conceptualized as a distance along the scale of measurement.");
        standdevarea.setWrapStyleWord(true);
        standdevpane.setViewportView(standdevarea);

        getContentPane().add(standdevpane);
        standdevpane.setBounds(20, 240, 350, 350);

        standerrarea.setEditable(false);
        standerrarea.setColumns(20);
        standerrarea.setLineWrap(true);
        standerrarea.setRows(5);
        standerrarea.setText("The Standard Error, or Standard Error of the Mean, is an estimate of the standard deviation of the sampling distribution of means, based on the data from one or more random samples.\n\nNumerically, it is equal to the square root of the quantity obtained when s2x is divided by the size of the sample.");
        standerrarea.setWrapStyleWord(true);
        standerrpane.setViewportView(standerrarea);

        getContentPane().add(standerrpane);
        standerrpane.setBounds(20, 240, 350, 350);

        statisticarea.setEditable(false);
        statisticarea.setColumns(20);
        statisticarea.setLineWrap(true);
        statisticarea.setRows(5);
        statisticarea.setText("A statistic is a measure on the items in a random sample. Since the only reason to ever draw a random sample is to infer something about the population from which it came, it should be clear that when we calculate a given statistic we only do so in order to estimate a corresponding parameter of the population from which the sample was drawn. An example of a statistic is the mean (i.e. average) of the measures in the sample.\n\nAs indicated by the central limit theorem, the mean of a random sample can be used to estimate the mean of the population from which the sample was taken.");
        statisticarea.setWrapStyleWord(true);
        statisticpane.setViewportView(statisticarea);

        getContentPane().add(statisticpane);
        statisticpane.setBounds(20, 240, 166, 96);

        stathyparea.setEditable(false);
        stathyparea.setColumns(20);
        stathyparea.setLineWrap(true);
        stathyparea.setRows(5);
        stathyparea.setText("The statistical hypothesis is sometimes called the Null Hypothesis. It is the hypothesis that is tested.");
        stathyparea.setWrapStyleWord(true);
        stathyppane.setViewportView(stathyparea);

        getContentPane().add(stathyppane);
        stathyppane.setBounds(20, 240, 350, 350);

        statsigarea.setEditable(false);
        statsigarea.setColumns(20);
        statsigarea.setLineWrap(true);
        statsigarea.setRows(5);
        statsigarea.setText("A finding (for example the observed difference between the means of two random samples) is described as statistically significant, when it can be demonstrated that the probability of obtaining such a difference by chance only, is relatively low. In Psychology, and in many other domains, it is customary to describe one's finding as statistically significant, when the obtained result is among those that (theoretically) would occur no more than 5 out of 100 times when the only factors operating are the chance variations that occur whenever random samples are drawn.");
        statsigarea.setWrapStyleWord(true);
        statsigpane.setViewportView(statsigarea);

        getContentPane().add(statsigpane);
        statsigpane.setBounds(20, 240, 350, 350);

        stattestarea.setEditable(false);
        stattestarea.setColumns(20);
        stattestarea.setLineWrap(true);
        stattestarea.setRows(5);
        stattestarea.setText("A statistical test is a procedure for deciding whether an assertion (e.g. an Hypothesis) about a quantitative feature of a population is true or false. We test an hypothesis of this sort by drawing a random sample from the population in question and calculating an appropriate statistic on its items. If, in doing so, we obtain a value of the statistic that would occur rarely when the hypothesis is true, we would have reason to reject the hypothesis.\n\nWith this procedure it is customary to reject the hypothesis tested when our statistic has a value that is among those that, theoretically, would be expected to occur no more than 5 out of every 100 times that a random sample (of the same size) is drawn from the population in question when the hypothesis is, in fact, true. Much of the text of this tutorial is devoted to explanations of exactly how this kind of theoretical expectation is developed.\n\nFinally, it is noteworthy that the appropriate conduct of any statistical test invariably requires many thoughtful decisions. It is, for example, always necessary to decide what statistic to use, what sample size to employ and what criteria to establish for rejection of the hypothesis tested.");
        stattestarea.setWrapStyleWord(true);
        stattestpane.setViewportView(stattestarea);

        getContentPane().add(stattestpane);
        stattestpane.setBounds(20, 240, 350, 350);

        sumofsqarea.setEditable(false);
        sumofsqarea.setColumns(20);
        sumofsqarea.setLineWrap(true);
        sumofsqarea.setRows(5);
        sumofsqarea.setText("In an ANOVA the term Sum of Squares refers to an interim quantity used in the calculation of an estimate of the population variance.\n\nIn a one-way ANOVA the Within Sum of Squares is a quantity used in the calculation of the Within Mean Square. More specifically the Within Sum of Squares divided by its Degrees of Freedom is equal to the Within Mean Square. Under the Null Hypothesis, the Within Mean Square is an unbiased estimate of the population variance.\n\nSimilarly, the Between Sum of Squares is a quantity used in the calculation of the Between Mean Square. More specifically the Between Mean Square is equal to the Between Sum of Squares divided by its Degrees of Freedom. Under the Null Hypothesis, the Between Mean Square is also an unbiased estimate of the population variance.");
        sumofsqarea.setWrapStyleWord(true);
        sumofsqpane.setViewportView(sumofsqarea);

        getContentPane().add(sumofsqpane);
        sumofsqpane.setBounds(20, 240, 350, 350);

        stattarea.setEditable(false);
        stattarea.setColumns(20);
        stattarea.setLineWrap(true);
        stattarea.setRows(5);
        stattarea.setText("This statistic is a measure on a random sample (or pair of samples) in which a mean (or pair of means) appears in the numerator and an estimate of the numerator's standard deviation appears in the denominator. The latter estimate is based on the calculated s² or s²s of the samples.\n\nIf these calculations yield a value of (t) that is sufficiently different from zero, the test is considered to be statistically significant");
        stattarea.setWrapStyleWord(true);
        stattpane.setViewportView(stattarea);

        getContentPane().add(stattpane);
        stattpane.setBounds(20, 240, 350, 350);

        ttestarea.setEditable(false);
        ttestarea.setColumns(20);
        ttestarea.setLineWrap(true);
        ttestarea.setRows(5);
        ttestarea.setText("The test of a given statistical hypothesis in which a value of the statistic that is either sufficiently small or sufficiently large will lead to rejection of the hypothesis tested.\n\nThe statistical tables for Z and for t provide critical values for both one- and two-tailed tests. That is, they provide the critical values that cut off an entire α region at one or the other end of the sampling distribution as well as the critical values that cut off the 1/2 α regions at both ends of the sampling distribution.");
        ttestarea.setWrapStyleWord(true);
        ttestpane.setViewportView(ttestarea);

        getContentPane().add(ttestpane);
        ttestpane.setBounds(20, 240, 166, 96);

        transrulesarea.setEditable(false);
        transrulesarea.setColumns(20);
        transrulesarea.setLineWrap(true);
        transrulesarea.setRows(5);
        transrulesarea.setText("In statistics the transformation rules describe the changes in the mean, variance and standard deviation of a distribution when every item in a distribution is either increased or decreased by a constant amount. These rules also describe the changes in the mean, variance and standard deviation of a distribution when every item in the distribution is either multiplied or divided by a constant amount.\n\nTransformation rule (1): Adding a constant to every item in a distribution adds the constant to the mean of the distribution, but it leaves the variance and standard deviation, unchanged.\nTransformation rule (2): Multiplying every item in a distribution by a constant multiplies the mean and standard deviation of that distribution by the constant and it multiplies the variance of the distribution by the square of the constant.");
        transrulesarea.setWrapStyleWord(true);
        transrulespane.setViewportView(transrulesarea);

        getContentPane().add(transrulespane);
        transrulespane.setBounds(30, 240, 166, 96);

        twotailedtestarea.setEditable(false);
        twotailedtestarea.setColumns(20);
        twotailedtestarea.setLineWrap(true);
        twotailedtestarea.setRows(5);
        twotailedtestarea.setText("The test of a given statistical hypothesis in which a value of the statistic that is either sufficiently small or sufficiently large will lead to rejection of the hypothesis tested.\n\nThe statistical tables for Z and for t provide critical values for both one- and two-tailed tests. That is, they provide the critical values that cut off an entire α region at one or the other end of the sampling distribution as well as the critical values that cut off the 1/2 α regions at both ends of the sampling distribution.");
        twotailedtestarea.setWrapStyleWord(true);
        twotailedtestpane.setViewportView(twotailedtestarea);

        getContentPane().add(twotailedtestpane);
        twotailedtestpane.setBounds(20, 240, 350, 350);

        typeIerrarea.setEditable(false);
        typeIerrarea.setColumns(20);
        typeIerrarea.setLineWrap(true);
        typeIerrarea.setRows(5);
        typeIerrarea.setText("You have committed a type I error if you have rejected the hypothesis tested when it was true.\n\nIn a given statistical test, the probability of a type I error is equal to the value you have set for α.");
        typeIerrarea.setWrapStyleWord(true);
        typeIerrpane.setViewportView(typeIerrarea);

        getContentPane().add(typeIerrpane);
        typeIerrpane.setBounds(20, 240, 350, 350);

        typeIIerrarea.setEditable(false);
        typeIIerrarea.setColumns(20);
        typeIIerrarea.setLineWrap(true);
        typeIIerrarea.setRows(5);
        typeIIerrarea.setText("You have committed a type II error if you have failed to reject the hypothesis tested when a given alternative hypothesis was true.\n\nIn a given statistical test the probability of a type II error is equal to the value calculated for ß.");
        typeIIerrarea.setWrapStyleWord(true);
        typeIIerrpane.setViewportView(typeIIerrarea);

        getContentPane().add(typeIIerrpane);
        typeIIerrpane.setBounds(20, 240, 350, 350);

        unbiasedarea.setEditable(false);
        unbiasedarea.setColumns(20);
        unbiasedarea.setLineWrap(true);
        unbiasedarea.setRows(5);
        unbiasedarea.setText("A statistic is said to be an unbiased estimate of a given parameter when the mean of the sampling distribution of that statistic can be shown to be equal to the parameter being estimated.\n\nFor example, the mean of a sample is an unbiased estimate of the mean of the population from which the sample was drawn.\n\ns² calculated on a sample is an unbiased estimate of the variance of the population from which the sample was drawn.\n\ns² divided by n (the size of the sample) is an unbiased estimate of the variance of the sampling distribution of means for random samples of size n and the square root of this quantity is called the standard error of the mean. It is a commonly used index of the error entailed in estimating a population mean based on the information in a random sample of size n.");
        unbiasedarea.setWrapStyleWord(true);
        unbiasestpane.setViewportView(unbiasedarea);

        getContentPane().add(unbiasestpane);
        unbiasestpane.setBounds(20, 240, 350, 350);

        vararea.setEditable(false);
        vararea.setColumns(20);
        vararea.setLineWrap(true);
        vararea.setRows(5);
        vararea.setText("The variance is one of several indices of variability that statisticians use to characterize the dispersion among the measures in a given population. To calculate the variance of a given population, it is necessary to first calculate the mean of the scores, then measure the amount that each score deviates from the mean and then square that deviation (by multiplying it by itself). Numerically, the variance equals the average of the several squared deviations from the mean.");
        vararea.setWrapStyleWord(true);
        varpane.setViewportView(vararea);

        getContentPane().add(varpane);
        varpane.setBounds(20, 240, 350, 350);

        statzarea.setEditable(false);
        statzarea.setColumns(20);
        statzarea.setLineWrap(true);
        statzarea.setRows(5);
        statzarea.setText("This statistic is a measure on a random sample (or pair of samples) in which a mean (or pair of means) appears in the numerator and the numerator's standard deviation appears in the denominator.\n\nIf these calculations yield a value of (z) that is sufficiently different from zero, the test is considered to be statistically significant.");
        statzarea.setWrapStyleWord(true);
        statzpane.setViewportView(statzarea);

        getContentPane().add(statzpane);
        statzpane.setBounds(20, 240, 350, 350);

        zscorearea.setEditable(false);
        zscorearea.setColumns(20);
        zscorearea.setLineWrap(true);
        zscorearea.setRows(5);
        zscorearea.setText("Z scores are a special application of the transformation rules. The z score for an item, indicates how far and in what direction, that item deviates from its distribution's mean, expressed in units of its distribution's standard deviation. The mathematics of the z score transformation are such that if every item in a distribution is converted to its z score, the transformed scores will necessarily have a mean of zero and a standard deviation of one.\n\nZ scores are sometimes called \"standard scores\". The z score transformation is especially useful when seeking to compare the relative standings of items from distributions with different means and/or different standard deviations.\n\nZ scores are especially informative when the distribution to which they refer is normal. In every normal distribution, the distance between the mean and a given Z score cuts off a fixed proportion of the total area under the curve. Statisticians have provided us with tables indicating the value of these proportions for each possible Z score.");
        zscorearea.setWrapStyleWord(true);
        zscorepane.setViewportView(zscorearea);

        getContentPane().add(zscorepane);
        zscorepane.setBounds(20, 240, 350, 350);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bgsupapp.jpg"))); // NOI18N
        bg.setText("jLabel1");
        getContentPane().add(bg);
        bg.setBounds(0, 0, 401, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onetooneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetooneBtnActionPerformed
       
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(true);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(true);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
     
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
      
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(true);    
    }//GEN-LAST:event_onetooneBtnActionPerformed

    private void wkshpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wkshpBtnActionPerformed
      alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
    usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(true);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(true);
      wkshpinfo.setVisible(true);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
     
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
    
      ototxt.setVisible(false);
      
    }//GEN-LAST:event_wkshpBtnActionPerformed

    private void resBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resBtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        
        
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(true);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(true);
     
      usefuldefBtn.setVisible(true);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);    
    }//GEN-LAST:event_resBtnActionPerformed

    private void DiagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagBtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
     usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(true);
      jResplbl.setVisible(false);
      diaginfo.setVisible(true);
      appointmentBtn.setVisible(true);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
     
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(true);
      
      ototxt.setVisible(false);
    }//GEN-LAST:event_DiagBtnActionPerformed

    private void serviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        
        
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(true);
        mathtutorbtn.setVisible(true);
        khanbtn.setVisible(true);
        mathcentrebtn.setVisible(true);
    messagefield3.setVisible(false);
        messagepane3.setVisible(false);
      messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
     usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
    
      ototxt.setVisible(false);
        
    }//GEN-LAST:event_serviceBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
    
    }//GEN-LAST:event_homeBtnActionPerformed

    private void subjectField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectField2ActionPerformed
     
    }//GEN-LAST:event_subjectField2ActionPerformed

    private void emailField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailField1ActionPerformed
String Str;
File inFile;
FileReader fr;
BufferedReader br;

try{
    inFile = new File("RememberedEmail.txt");
    fr = new FileReader(inFile);
    br = new BufferedReader(fr);
            
            Email = br.readLine();
            
            JOptionPane.showMessageDialog(null,"Email loaded succesfully");
            emailField1.setText(Email);  
}catch(IOException e){
        JOptionPane.showMessageDialog(null,"Error writing to a file: " +e);
       }

    }//GEN-LAST:event_emailField1ActionPerformed

    private void appointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentBtnActionPerformed
      alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(true);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(true);
        messagepane3.setVisible(true);
        messagelbl.setVisible(true);
      subjectlbl.setVisible(true);
      usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(true);
      emailField1.setVisible(true); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(true);
      subjectField2.setVisible(true);
     
      sendBtn.setVisible(true);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
     
      ototxt.setVisible(false);   
   
    }//GEN-LAST:event_appointmentBtnActionPerformed

    private void viewwkshpttBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewwkshpttBtnActionPerformed
 alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        timetablepane.setVisible(true);
          timetablepnl.setVisible(true);
        timetablelbl.setVisible(true);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
      definitionpanel.setVisible(false);
       displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
    messagefield3.setVisible(false);
        messagepane3.setVisible(false);
      messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
     usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
    
      ototxt.setVisible(false);
    }//GEN-LAST:event_viewwkshpttBtnActionPerformed

    private void dfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(true);
        dfarea.setVisible(true);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(true);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(true);
     
      usefuldefBtn.setVisible(true);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);    
    }//GEN-LAST:event_dfbtnActionPerformed

    private void alphabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphabtnActionPerformed
    alphapane.setVisible(true);
        alphaarea.setVisible(true);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);       
    }//GEN-LAST:event_alphabtnActionPerformed

    private void parambtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parambtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(true);
        paramarea.setVisible(true);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_parambtnActionPerformed

    private void usefuldefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usefuldefBtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
        
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(true);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(true);
     definitionpane.setVisible(true);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_usefuldefBtnActionPerformed

    private void AlthypbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlthypbtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(true);
        althyparea.setVisible(true);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
    timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_AlthypbtnActionPerformed

    private void corcoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corcoeActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(true);
        corlcoefarea.setVisible(true);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
   timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);           
    }//GEN-LAST:event_corcoeActionPerformed

    private void khanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khanbtnActionPerformed
    try {
        String URL ="https://www.khanacademy.org/";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
    }                                            
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    

    }//GEN-LAST:event_khanbtnActionPerformed

    private void mathcentrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathcentrebtnActionPerformed
     try {
        String URL ="http://www.mathcentre.ac.uk/";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
    }                                            
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

    }//GEN-LAST:event_mathcentrebtnActionPerformed

    private void mathtutorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathtutorbtnActionPerformed
 try {
        String URL ="http://www.mathtutor.ac.uk/";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
    }                                            
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_mathtutorbtnActionPerformed

    private void openunibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openunibtnActionPerformed
 try {
        String URL ="http://maths-study-skills.open.ac.uk/";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
    }                                            
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_openunibtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed

        Email = emailField1.getText();
        Subject = subjectField2.getText();
        message = messagefield3.getText();
        
        Array arr = new Array ();
        
        
        arr.setEmail(Email);
        arr.setSubject(Subject);
        arr.setMessage(message);
        
        msg[count] = arr;
        count++;
        
        File outFile;
        FileWriter fw;
        BufferedWriter bw;
        
       try{
           outFile = new File("RememberedEmail.txt");
        fw = new FileWriter(outFile);
        bw = new BufferedWriter(fw);
       
        bw.write(Email);
        
        bw.close();
        JOptionPane.showMessageDialog(null,"File successfully written, email now remembered");
       }
       catch(IOException e){
        JOptionPane.showMessageDialog(null,"Error writing to a file: " +e);
       }
        
    }//GEN-LAST:event_sendBtnActionPerformed

    private void displaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybtnActionPerformed
      
        
        for(int i =0; i < count; i++){
            JOptionPane.showMessageDialog(null,"Email: "+msg[i].getEmail()+"\n Subject: "+msg[i].getSubject()+"\n Message: "+msg[i].getMessage());
        }
    }//GEN-LAST:event_displaybtnActionPerformed

    private void q1yesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1yesbtnActionPerformed
      num--;
    }//GEN-LAST:event_q1yesbtnActionPerformed

    private void q2noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2noActionPerformed
     num++;
    }//GEN-LAST:event_q2noActionPerformed

    private void q6noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6noActionPerformed
num--;  
    }//GEN-LAST:event_q6noActionPerformed

    private void q8noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q8noActionPerformed
num++;    
    }//GEN-LAST:event_q8noActionPerformed

    private void q9noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q9noActionPerformed
num--;      
    }//GEN-LAST:event_q9noActionPerformed

    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(true);
        quizpnl.setVisible(true);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_quizBtnActionPerformed

    private void q1nobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1nobtnActionPerformed
num++;   
    }//GEN-LAST:event_q1nobtnActionPerformed

    private void q2yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2yesActionPerformed
num--;
    }//GEN-LAST:event_q2yesActionPerformed

    private void q3yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3yesActionPerformed
num++;     
    }//GEN-LAST:event_q3yesActionPerformed

    private void q3noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3noActionPerformed
num--;
    }//GEN-LAST:event_q3noActionPerformed

    private void q4yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4yesActionPerformed
num--;
    }//GEN-LAST:event_q4yesActionPerformed

    private void q4noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4noActionPerformed
num++;
    }//GEN-LAST:event_q4noActionPerformed

    private void q5yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5yesActionPerformed
num--;
    }//GEN-LAST:event_q5yesActionPerformed

    private void q5noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5noActionPerformed
num++;  
    }//GEN-LAST:event_q5noActionPerformed

    private void q6yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6yesActionPerformed
num--;
    }//GEN-LAST:event_q6yesActionPerformed

    private void q7yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q7yesActionPerformed
num++;        // TODO add your handling code here:
    }//GEN-LAST:event_q7yesActionPerformed

    private void q7noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q7noActionPerformed
num--;      
    }//GEN-LAST:event_q7noActionPerformed

    private void q8yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q8yesActionPerformed
num--;
    }//GEN-LAST:event_q8yesActionPerformed

    private void q9yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q9yesActionPerformed
num++;
    }//GEN-LAST:event_q9yesActionPerformed

    private void q10yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q10yesActionPerformed
num++;
    }//GEN-LAST:event_q10yesActionPerformed

    private void q10noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q10noActionPerformed
num--;
    }//GEN-LAST:event_q10noActionPerformed

    private void q11yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q11yesActionPerformed
num--;
    }//GEN-LAST:event_q11yesActionPerformed

    private void q11noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q11noActionPerformed
num++;
    }//GEN-LAST:event_q11noActionPerformed

    private void q12yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q12yesActionPerformed
num--;
    }//GEN-LAST:event_q12yesActionPerformed

    private void q12noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q12noActionPerformed
num++;       
    }//GEN-LAST:event_q12noActionPerformed

    private void qsubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qsubmitbtnActionPerformed
if(num <=5){
  JOptionPane.showMessageDialog(null, "You Are unlikely to have Dyscalculia");   
}
if(num >=15){
  JOptionPane.showMessageDialog(null, "You Are likely to have Dyscalculia");   
}

else{
  JOptionPane.showMessageDialog(null, "your mathematical competency seems average");   

}
    }//GEN-LAST:event_qsubmitbtnActionPerformed

    private void anlvarybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anlvarybtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(true);
        anlvararea.setVisible(true);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_anlvarybtnActionPerformed

    private void avdevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avdevbtnActionPerformed
          alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(true);
        avdevarea.setVisible(true);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_avdevbtnActionPerformed

    private void betabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betabtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(true);
        betaarea.setVisible(true);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_betabtnActionPerformed

    private void ctrllimittheobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrllimittheobtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(true);
        ctrllmtarea.setVisible(true);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_ctrllimittheobtnActionPerformed

    private void x2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2btnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(true);
        x2area.setVisible(true);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_x2btnActionPerformed

    private void confacbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confacbtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_confacbtnActionPerformed

    private void critregbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_critregbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(true);
        critregarea.setVisible(true);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);                   
                
      
    }//GEN-LAST:event_critregbtnActionPerformed

    private void statfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statfbtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(true);        
        statfarea.setVisible(true);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_statfbtnActionPerformed

    private void ftestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftestbtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(true);        
          ftestarea.setVisible(true);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_ftestbtnActionPerformed

    private void histogbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogbtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(true);       
          histogarea.setVisible(true);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_histogbtnActionPerformed

    private void meanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meanbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(true); 
          meanarea.setVisible(true);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_meanbtnActionPerformed

    private void meansqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meansqbtnActionPerformed
      alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(true);       
         meansqarea.setVisible(true);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_meansqbtnActionPerformed

    private void medianbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianbtnActionPerformed
          alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(true);      
          medianarea.setVisible(true);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_medianbtnActionPerformed

    private void modebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modebtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(true);      
          modearea.setVisible(true);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_modebtnActionPerformed

    private void nullhypobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nullhypobtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(true);      
          nullhyparea.setVisible(true);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);             
    }//GEN-LAST:event_nullhypobtnActionPerformed

    private void onetailtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetailtbtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(true);      
          ottarea.setVisible(true);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_onetailtbtnActionPerformed

    private void popbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popbtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(true);
        poparea.setVisible(true);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        
    }//GEN-LAST:event_popbtnActionPerformed

    private void powbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powbtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(true);        
         powerarea.setVisible(true);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_powbtnActionPerformed

    private void predbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predbtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(true);        
        predictarea.setVisible(true);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_predbtnActionPerformed

    private void randsampbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randsampbtnActionPerformed
      alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(true);        
        randsamparea.setVisible(true);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_randsampbtnActionPerformed

    private void rangebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangebtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(true);        
        rangearea.setVisible(true);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_rangebtnActionPerformed

    private void regrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrebtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(true);        
        regarea.setVisible(true);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);             
    }//GEN-LAST:event_regrebtnActionPerformed

    private void regtomeanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regtomeanbtnActionPerformed
    alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(true);        
        regtomeanarea.setVisible(true);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_regtomeanbtnActionPerformed

    private void relatemeabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatemeabtnActionPerformed
           alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(true);        
        regtomeanarea.setVisible(true);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_relatemeabtnActionPerformed

    private void sampmeanxbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampmeanxbtnActionPerformed
       alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(true);        
        sampmeanxbararea.setVisible(true);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_sampmeanxbtnActionPerformed

    private void sampdistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampdistbtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(true);        
        sampdistarea.setVisible(true);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);                    
                
    
     
    }//GEN-LAST:event_sampdistbtnActionPerformed

    private void s2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2btnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(true);        
        s2area.setVisible(true);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_s2btnActionPerformed

    private void standdevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standdevbtnActionPerformed
           alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(true);        
        standdevarea.setVisible(true);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
    timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_standdevbtnActionPerformed

    private void standerrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standerrbtnActionPerformed
          alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(true);        
        statisticpane.setVisible(true);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_standerrbtnActionPerformed

    private void stasticbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stasticbtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(true);        
        statisticarea.setVisible(true);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);          
    }//GEN-LAST:event_stasticbtnActionPerformed

    private void stathypbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stathypbtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(true); 
        stathyparea.setVisible(true);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_stathypbtnActionPerformed

    private void statsigbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsigbtnActionPerformed
        alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(true);        
        statsigarea.setVisible(true);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
  timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_statsigbtnActionPerformed

    private void stattestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stattestbtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(true);        
        stattestarea.setVisible(true);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_stattestbtnActionPerformed

    private void sumofsqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumofsqbtnActionPerformed
     alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(true);        
        sumofsqarea.setVisible(true);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_sumofsqbtnActionPerformed

    private void stattbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stattbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(true);        
        stattestarea.setVisible(true);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);                
    }//GEN-LAST:event_stattbtnActionPerformed

    private void ttestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttestbtnActionPerformed
           alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(true);        
        ttestarea.setVisible(true);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_ttestbtnActionPerformed

    private void transrulebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transrulebtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(true); 
        transrulesarea.setVisible(true);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);             
    }//GEN-LAST:event_transrulebtnActionPerformed

    private void twotailtestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twotailtestbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(true);        
        twotailedtestarea.setVisible(true);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_twotailtestbtnActionPerformed

    private void typeierbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeierbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(true);        
        typeIerrarea.setVisible(true);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
     timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_typeierbtnActionPerformed

    private void typeiierbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeiierbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(true);        
        typeIIerrarea.setVisible(true);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);          
    }//GEN-LAST:event_typeiierbtnActionPerformed

    private void unbiasestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unbiasestbtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(true);        
        unbiasedarea.setVisible(true);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
      timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_unbiasestbtnActionPerformed

    private void varibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varibtnActionPerformed
   alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(true);        
        vararea.setVisible(true);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_varibtnActionPerformed

    private void statzbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statzbtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(true);        
        statzarea.setVisible(true);        
        zscorepane.setVisible(false);        
        zscorearea.setVisible(false);        
                
                
                
        timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_statzbtnActionPerformed

    private void zscorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zscorebtnActionPerformed
         alphapane.setVisible(false);
        alphaarea.setVisible(false);
        althyppane.setVisible(false);
        althyparea.setVisible(false);
        anlvarpane.setVisible(false);
        anlvararea.setVisible(false);
        avdevpane.setVisible(false);
        avdevarea.setVisible(false);
        betapane.setVisible(false);
        betaarea.setVisible(false);
        Ctrllmttheopane.setVisible(false);
        ctrllmtarea.setVisible(false);
        x2pane.setVisible(false);
        x2area.setVisible(false);
        confactpane.setVisible(false);
        confactarea.setVisible(false);        
        corlcoefpane.setVisible(false);
        corlcoefarea.setVisible(false);
        critregpane.setVisible(false);
        critregarea.setVisible(false);
        dfpane.setVisible(false);
        dfarea.setVisible(false);
        statfpane.setVisible(false);        
        statfarea.setVisible(false);        
        ftestpane.setVisible(false);        
          ftestarea.setVisible(false);      
         histogpane.setVisible(false);       
          histogarea.setVisible(false);      
         meanpane.setVisible(false); 
          meanarea.setVisible(false);
          meansqpane.setVisible(false);       
         meansqarea.setVisible(false);      
          medianpane.setVisible(false);      
          medianarea.setVisible(false);      
          modepane.setVisible(false);      
          modearea.setVisible(false);      
          nullhyppane.setVisible(false);      
          nullhyparea.setVisible(false);      
          ottpane.setVisible(false);      
          ottarea.setVisible(false);
        parampane.setVisible(false);
        paramarea.setVisible(false);
        poppane.setVisible(false);
        poparea.setVisible(false);        
        powerpane.setVisible(false);        
         powerarea.setVisible(false);       
        predictpane.setVisible(false);        
        predictarea.setVisible(false);        
        randsamppane.setVisible(false);        
        randsamparea.setVisible(false);        
        rangepane.setVisible(false);        
        rangearea.setVisible(false);        
        regpane.setVisible(false);        
        regarea.setVisible(false);        
        regtomeanpane.setVisible(false);        
        regtomeanarea.setVisible(false);        
        relatedmeasurepane.setVisible(false);        
        relatedmeasurearea.setVisible(false);        
        sampmeanxbarpane.setVisible(false);        
        sampmeanxbararea.setVisible(false);        
        sampdistpane.setVisible(false);        
        sampdistarea.setVisible(false);        
        s2pane.setVisible(false);        
        s2area.setVisible(false);       
        standdevpane.setVisible(false);        
        standdevarea.setVisible(false);        
        standerrpane.setVisible(false);        
        standerrarea.setVisible(false);        
        statisticpane.setVisible(false);        
        statisticarea.setVisible(false);        
        stathyppane.setVisible(false); 
        stathyparea.setVisible(false);        
        statsigpane.setVisible(false);        
        statsigarea.setVisible(false);        
        stattestpane.setVisible(false);        
        stattestarea.setVisible(false);        
        sumofsqpane.setVisible(false);        
        sumofsqarea.setVisible(false);        
        stattpane.setVisible(false);        
        stattarea.setVisible(false);        
        ttestpane.setVisible(false);        
        ttestarea.setVisible(false);        
        transrulespane.setVisible(false); 
        transrulesarea.setVisible(false);        
        twotailedtestpane.setVisible(false);        
        twotailedtestarea.setVisible(false);        
        typeIerrpane.setVisible(false);        
        typeIerrarea.setVisible(false);        
        typeIIerrpane.setVisible(false);        
        typeIIerrarea.setVisible(false);        
        unbiasestpane.setVisible(false);        
        unbiasedarea.setVisible(false);        
        varpane.setVisible(false);        
        vararea.setVisible(false);        
        statzpane.setVisible(false);        
        statzarea.setVisible(false);        
        zscorepane.setVisible(true);        
        zscorearea.setVisible(true);        
                
                
                
       timetablepane.setVisible(false);
        timetablepnl.setVisible(false);
        timetablelbl.setVisible(false);
        quizpane.setVisible(false);
        quizpnl.setVisible(false);
        definitionpanel.setVisible(false);
        displaybtn.setVisible(false);
        openunibtn.setVisible(false);
        mathtutorbtn.setVisible(false);
        khanbtn.setVisible(false);
        mathcentrebtn.setVisible(false);
        messagefield3.setVisible(false);
        messagepane3.setVisible(false);
        messagelbl.setVisible(false);
      subjectlbl.setVisible(false);
   usefuldeflbl.setVisible(false);
     definitionpane.setVisible(false);
      wkshptxt.setVisible(false);
      diagtxt.setVisible(false);
      jResplbl.setVisible(false);
      diaginfo.setVisible(false);
      appointmentBtn.setVisible(false);
      emaillbl.setVisible(false);
      emailField1.setVisible(false); 
      homeBtn.setVisible(false);
      viewwkshpttBtn.setVisible(false);
      wkshpinfo.setVisible(false);
      onetoonearea.setVisible(false);
      emailField1.setVisible(false);
      subjectField2.setVisible(false);
      
      sendBtn.setVisible(false);     
      serviceBtn.setVisible(false);
     
      usefuldefBtn.setVisible(false);
      quizBtn.setVisible(false);
      
      ototxt.setVisible(false);         
    }//GEN-LAST:event_zscorebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisabilityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DisabilityGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Althypbtn;
    private javax.swing.JScrollPane Ctrllmttheopane;
    private javax.swing.JButton DiagBtn;
    private javax.swing.JTextArea alphaarea;
    private javax.swing.JButton alphabtn;
    private javax.swing.JScrollPane alphapane;
    private javax.swing.JTextArea althyparea;
    private javax.swing.JScrollPane althyppane;
    private javax.swing.JTextArea anlvararea;
    private javax.swing.JScrollPane anlvarpane;
    private javax.swing.JButton anlvarybtn;
    private javax.swing.JButton appointmentBtn;
    private javax.swing.JTextArea avdevarea;
    private javax.swing.JButton avdevbtn;
    private javax.swing.JScrollPane avdevpane;
    private javax.swing.JTextArea betaarea;
    private javax.swing.JButton betabtn;
    private javax.swing.JScrollPane betapane;
    private javax.swing.JLabel bg;
    private javax.swing.JButton confacbtn;
    private javax.swing.JTextArea confactarea;
    private javax.swing.JScrollPane confactpane;
    private javax.swing.JButton corcoe;
    private javax.swing.JTextArea corlcoefarea;
    private javax.swing.JScrollPane corlcoefpane;
    private javax.swing.JTextArea critregarea;
    private javax.swing.JButton critregbtn;
    private javax.swing.JScrollPane critregpane;
    private javax.swing.JButton ctrllimittheobtn;
    private javax.swing.JTextArea ctrllmtarea;
    private javax.swing.JScrollPane definitionpane;
    private javax.swing.JPanel definitionpanel;
    private javax.swing.JTextArea dfarea;
    private javax.swing.JButton dfbtn;
    private javax.swing.JScrollPane dfpane;
    private javax.swing.JScrollPane diaginfo;
    private javax.swing.JTextArea diagtxt;
    private javax.swing.JButton displaybtn;
    private javax.swing.JLabel dyscalquiz;
    private javax.swing.JTextField emailField1;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextArea ftestarea;
    private javax.swing.JButton ftestbtn;
    private javax.swing.JScrollPane ftestpane;
    private javax.swing.JTextArea histogarea;
    private javax.swing.JButton histogbtn;
    private javax.swing.JScrollPane histogpane;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jResplbl;
    private javax.swing.JButton khanbtn;
    private javax.swing.JButton mathcentrebtn;
    private javax.swing.JButton mathtutorbtn;
    private javax.swing.JTextArea meanarea;
    private javax.swing.JButton meanbtn;
    private javax.swing.JScrollPane meanpane;
    private javax.swing.JTextArea meansqarea;
    private javax.swing.JButton meansqbtn;
    private javax.swing.JScrollPane meansqpane;
    private javax.swing.JTextArea medianarea;
    private javax.swing.JButton medianbtn;
    private javax.swing.JScrollPane medianpane;
    private javax.swing.JTextArea messagefield3;
    private javax.swing.JLabel messagelbl;
    private javax.swing.JScrollPane messagepane3;
    private javax.swing.JTextArea modearea;
    private javax.swing.JButton modebtn;
    private javax.swing.JScrollPane modepane;
    private javax.swing.JTextArea nullhyparea;
    private javax.swing.JButton nullhypobtn;
    private javax.swing.JScrollPane nullhyppane;
    private javax.swing.JButton onetailtbtn;
    private javax.swing.JButton onetooneBtn;
    private javax.swing.JScrollPane onetoonearea;
    private javax.swing.JButton openunibtn;
    private javax.swing.JTextArea ototxt;
    private javax.swing.JTextArea ottarea;
    private javax.swing.JScrollPane ottpane;
    private javax.swing.JTextArea paramarea;
    private javax.swing.JButton parambtn;
    private javax.swing.JScrollPane parampane;
    private javax.swing.JTextArea poparea;
    private javax.swing.JButton popbtn;
    private javax.swing.JScrollPane poppane;
    private javax.swing.JButton powbtn;
    private javax.swing.JTextArea powerarea;
    private javax.swing.JScrollPane powerpane;
    private javax.swing.JButton predbtn;
    private javax.swing.JTextArea predictarea;
    private javax.swing.JScrollPane predictpane;
    private javax.swing.ButtonGroup q10btngrp;
    private javax.swing.JLabel q10lbl;
    private javax.swing.JRadioButton q10no;
    private javax.swing.JRadioButton q10yes;
    private javax.swing.ButtonGroup q11btngrp;
    private javax.swing.JLabel q11lbl;
    private javax.swing.JRadioButton q11no;
    private javax.swing.JRadioButton q11yes;
    private javax.swing.ButtonGroup q12btngrp;
    private javax.swing.JLabel q12lbl;
    private javax.swing.JRadioButton q12no;
    private javax.swing.JRadioButton q12yes;
    private javax.swing.ButtonGroup q1btngrp;
    private javax.swing.JLabel q1lbl;
    private javax.swing.JRadioButton q1nobtn;
    private javax.swing.JRadioButton q1yesbtn;
    private javax.swing.ButtonGroup q2btngrp;
    private javax.swing.JLabel q2lbl;
    private javax.swing.JRadioButton q2no;
    private javax.swing.JRadioButton q2yes;
    private javax.swing.ButtonGroup q3btngrp;
    private javax.swing.JLabel q3lbl;
    private javax.swing.JRadioButton q3no;
    private javax.swing.JRadioButton q3yes;
    private javax.swing.ButtonGroup q4btngrp;
    private javax.swing.JLabel q4lbl;
    private javax.swing.JRadioButton q4no;
    private javax.swing.JRadioButton q4yes;
    private javax.swing.ButtonGroup q5btngrp;
    private javax.swing.JLabel q5lbl;
    private javax.swing.JRadioButton q5no;
    private javax.swing.JRadioButton q5yes;
    private javax.swing.ButtonGroup q6btngrp;
    private javax.swing.JLabel q6lbl;
    private javax.swing.JRadioButton q6no;
    private javax.swing.JRadioButton q6yes;
    private javax.swing.ButtonGroup q7btngrp;
    private javax.swing.JLabel q7lbl;
    private javax.swing.JRadioButton q7no;
    private javax.swing.JRadioButton q7yes;
    private javax.swing.ButtonGroup q8btngrp;
    private javax.swing.JLabel q8lbl;
    private javax.swing.JRadioButton q8no;
    private javax.swing.JRadioButton q8yes;
    private javax.swing.ButtonGroup q9btngrp;
    private javax.swing.JLabel q9lbl;
    private javax.swing.JRadioButton q9no;
    private javax.swing.JRadioButton q9yes;
    private javax.swing.JButton qsubmitbtn;
    private javax.swing.JButton quizBtn;
    private javax.swing.JLabel quizheaderlbl;
    private javax.swing.JScrollPane quizpane;
    private javax.swing.JPanel quizpnl;
    private javax.swing.JTextArea randsamparea;
    private javax.swing.JButton randsampbtn;
    private javax.swing.JScrollPane randsamppane;
    private javax.swing.JTextArea rangearea;
    private javax.swing.JButton rangebtn;
    private javax.swing.JScrollPane rangepane;
    private javax.swing.JTextArea regarea;
    private javax.swing.JScrollPane regpane;
    private javax.swing.JButton regrebtn;
    private javax.swing.JTextArea regtomeanarea;
    private javax.swing.JButton regtomeanbtn;
    private javax.swing.JScrollPane regtomeanpane;
    private javax.swing.JTextArea relatedmeasurearea;
    private javax.swing.JScrollPane relatedmeasurepane;
    private javax.swing.JButton relatemeabtn;
    private javax.swing.JButton resBtn;
    private javax.swing.JTextArea s2area;
    private javax.swing.JButton s2btn;
    private javax.swing.JScrollPane s2pane;
    private javax.swing.JTextArea sampdistarea;
    private javax.swing.JButton sampdistbtn;
    private javax.swing.JScrollPane sampdistpane;
    private javax.swing.JTextArea sampmeanxbararea;
    private javax.swing.JScrollPane sampmeanxbarpane;
    private javax.swing.JButton sampmeanxbtn;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton serviceBtn;
    private javax.swing.JTextArea standdevarea;
    private javax.swing.JButton standdevbtn;
    private javax.swing.JScrollPane standdevpane;
    private javax.swing.JTextArea standerrarea;
    private javax.swing.JButton standerrbtn;
    private javax.swing.JScrollPane standerrpane;
    private javax.swing.JButton stasticbtn;
    private javax.swing.JTextArea statfarea;
    private javax.swing.JButton statfbtn;
    private javax.swing.JScrollPane statfpane;
    private javax.swing.JTextArea stathyparea;
    private javax.swing.JButton stathypbtn;
    private javax.swing.JScrollPane stathyppane;
    private javax.swing.JTextArea statisticarea;
    private javax.swing.JScrollPane statisticpane;
    private javax.swing.JTextArea statsigarea;
    private javax.swing.JButton statsigbtn;
    private javax.swing.JScrollPane statsigpane;
    private javax.swing.JTextArea stattarea;
    private javax.swing.JButton stattbtn;
    private javax.swing.JTextArea stattestarea;
    private javax.swing.JButton stattestbtn;
    private javax.swing.JScrollPane stattestpane;
    private javax.swing.JScrollPane stattpane;
    private javax.swing.JTextArea statzarea;
    private javax.swing.JButton statzbtn;
    private javax.swing.JScrollPane statzpane;
    private javax.swing.JTextField subjectField2;
    private javax.swing.JLabel subjectlbl;
    private javax.swing.JTextArea sumofsqarea;
    private javax.swing.JButton sumofsqbtn;
    private javax.swing.JScrollPane sumofsqpane;
    private javax.swing.JLabel timetablelbl;
    private javax.swing.JScrollPane timetablepane;
    private javax.swing.JPanel timetablepnl;
    private javax.swing.JButton transrulebtn;
    private javax.swing.JTextArea transrulesarea;
    private javax.swing.JScrollPane transrulespane;
    private javax.swing.JTextArea ttestarea;
    private javax.swing.JButton ttestbtn;
    private javax.swing.JScrollPane ttestpane;
    private javax.swing.JTextArea twotailedtestarea;
    private javax.swing.JScrollPane twotailedtestpane;
    private javax.swing.JButton twotailtestbtn;
    private javax.swing.JTextArea typeIIerrarea;
    private javax.swing.JScrollPane typeIIerrpane;
    private javax.swing.JTextArea typeIerrarea;
    private javax.swing.JScrollPane typeIerrpane;
    private javax.swing.JButton typeierbtn;
    private javax.swing.JButton typeiierbtn;
    private javax.swing.JTextArea unbiasedarea;
    private javax.swing.JButton unbiasestbtn;
    private javax.swing.JScrollPane unbiasestpane;
    private javax.swing.JButton usefuldefBtn;
    private javax.swing.JLabel usefuldeflbl;
    private javax.swing.JTextArea vararea;
    private javax.swing.JButton varibtn;
    private javax.swing.JScrollPane varpane;
    private javax.swing.JButton viewwkshpttBtn;
    private javax.swing.JButton wkshpBtn;
    private javax.swing.JScrollPane wkshpinfo;
    private javax.swing.JTextArea wkshptxt;
    private javax.swing.JTextArea x2area;
    private javax.swing.JButton x2btn;
    private javax.swing.JScrollPane x2pane;
    private javax.swing.JTextArea zscorearea;
    private javax.swing.JButton zscorebtn;
    private javax.swing.JScrollPane zscorepane;
    // End of variables declaration//GEN-END:variables
}
