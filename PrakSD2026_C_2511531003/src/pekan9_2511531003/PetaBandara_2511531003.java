package pekan9_2511531003;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class PetaBandara_2511531003 extends JFrame {

    private Map<String, List<String>> graph_1003 = new HashMap<>();

    private JComboBox<String> start_1003;
    private JComboBox<String> goal_1003;

    private JTextArea hasil_1003;

    private GraphPanel_1003 panelGraph_1003;

    public PetaBandara_2511531003() {

        setTitle("Peta Bandara BFS DFS - 2511531003");
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buatGraph_1003();

        JPanel atas = new JPanel();

        start_1003 = new JComboBox<>(
                graph_1003.keySet().toArray(new String[0]));

        goal_1003 = new JComboBox<>(
                graph_1003.keySet().toArray(new String[0]));

        JButton bfsBtn = new JButton("BFS");
        JButton dfsBtn = new JButton("DFS");
        JButton resetBtn = new JButton("RESET");

        atas.add(new JLabel("Start"));
        atas.add(start_1003);

        atas.add(new JLabel("Goal"));
        atas.add(goal_1003);

        atas.add(bfsBtn);
        atas.add(dfsBtn);
        atas.add(resetBtn);

        panelGraph_1003 = new GraphPanel_1003();

        hasil_1003 = new JTextArea();
        hasil_1003.setEditable(false);

        JSplitPane split = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                panelGraph_1003,
                new JScrollPane(hasil_1003));

        split.setDividerLocation(650);

        add(atas, BorderLayout.NORTH);
        add(split, BorderLayout.CENTER);

        bfsBtn.addActionListener(e -> BFS_1003());

        dfsBtn.addActionListener(e -> DFS_1003());

        resetBtn.addActionListener(e -> resetGraph_1003());
    }

    private void addEdge_1003(String a, String b){

        graph_1003.putIfAbsent(a,new ArrayList<>());
        graph_1003.putIfAbsent(b,new ArrayList<>());

        graph_1003.get(a).add(b);
        graph_1003.get(b).add(a);
    }

    private void buatGraph_1003(){

        addEdge_1003("Pintu Masuk","Check In");
        addEdge_1003("Pintu Masuk","Bagasi");

        addEdge_1003("Check In","Security");
        addEdge_1003("Check In","Ruang Tunggu");

        addEdge_1003("Security","Terminal A");
        addEdge_1003("Security","Terminal B");

        addEdge_1003("Ruang Tunggu","Terminal A");
        addEdge_1003("Ruang Tunggu","Terminal B");

        addEdge_1003("Terminal A","Gate 1");
        addEdge_1003("Terminal A","Gate 2");

        addEdge_1003("Terminal B","Gate 2");
        addEdge_1003("Terminal B","Gate 3");

        addEdge_1003("Gate 1","Bagasi");
        addEdge_1003("Gate 2","Bagasi");
        addEdge_1003("Gate 3","Bagasi");
    }

    private void BFS_1003(){

        String start = start_1003.getSelectedItem().toString();
        String goal = goal_1003.getSelectedItem().toString();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new LinkedHashSet<>();
        Map<String,String> parent = new HashMap<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){

            String current = queue.poll();

            if(current.equals(goal))
                break;

            for(String next :
                    graph_1003.getOrDefault(current,new ArrayList<>())){

                if(!visited.contains(next)){

                    visited.add(next);
                    parent.put(next,current);
                    queue.add(next);
                }
            }
        }

        tampilkanHasil_1003(
                "BFS",
                visited,
                parent,
                start,
                goal);

        panelGraph_1003.setVisited(visited);
    }

    private void DFS_1003(){

        String start = start_1003.getSelectedItem().toString();
        String goal = goal_1003.getSelectedItem().toString();

        Stack<String> stack = new Stack<>();

        Set<String> visited = new LinkedHashSet<>();

        Map<String,String> parent = new HashMap<>();

        stack.push(start);

        while(!stack.isEmpty()){

            String current = stack.pop();

            if(!visited.contains(current)){

                visited.add(current);

                if(current.equals(goal))
                    break;

                List<String> tetangga =
                        graph_1003.get(current);

                for(String n : tetangga){

                    if(!visited.contains(n)){

                        parent.put(n,current);
                        stack.push(n);
                    }
                }
            }
        }

        tampilkanHasil_1003(
                "DFS",
                visited,
                parent,
                start,
                goal);

        panelGraph_1003.setVisited(visited);
    }

    private void tampilkanHasil_1003(
            String metode,
            Set<String> visited,
            Map<String,String> parent,
            String start,
            String goal){

        ArrayList<String> path = new ArrayList<>();

        String current = goal;

        while(current != null){

            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);

        hasil_1003.setText(
                "Metode : "+metode+
                "\n\nUrutan Node : "+
                visited+
                "\n\nPath : "+
                path+
                "\n\nJumlah Node Dieksplorasi : "+
                visited.size());
    }

    private void resetGraph_1003(){

        hasil_1003.setText("");
        panelGraph_1003.clearVisited();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->
                new PetaBandara_2511531003()
                        .setVisible(true));
    }

    class GraphPanel_1003 extends JPanel {

        private Set<String> visited_1003 =
                new HashSet<>();

        private Map<String,Point> posisi =
                new HashMap<>();

        public GraphPanel_1003(){

            posisi.put("Pintu Masuk",
                    new Point(80,300));

            posisi.put("Check In",
                    new Point(220,200));

            posisi.put("Security",
                    new Point(380,130));

            posisi.put("Ruang Tunggu",
                    new Point(380,280));

            posisi.put("Terminal A",
                    new Point(520,120));

            posisi.put("Terminal B",
                    new Point(520,300));

            posisi.put("Gate 1",
                    new Point(650,80));

            posisi.put("Gate 2",
                    new Point(650,220));

            posisi.put("Gate 3",
                    new Point(650,380));

            posisi.put("Bagasi",
                    new Point(250,450));
        }

        public void setVisited(
                Set<String> visited){

            visited_1003 = visited;
            repaint();
        }

        public void clearVisited(){

            visited_1003.clear();
            repaint();
        }

        protected void paintComponent(Graphics g){

            super.paintComponent(g);

            Graphics2D g2 =
                    (Graphics2D) g;

            for(String node :
                    graph_1003.keySet()){

                Point p1 = posisi.get(node);

                for(String next :
                        graph_1003.get(node)){

                    Point p2 = posisi.get(next);

                    g2.drawLine(
                            p1.x,p1.y,
                            p2.x,p2.y);
                }
            }

            for(String node :
                    posisi.keySet()){

                Point p = posisi.get(node);

                if(visited_1003.contains(node))
                    g2.setColor(Color.GREEN);
                else
                    g2.setColor(Color.LIGHT_GRAY);

                g2.fillOval(
                        p.x-25,
                        p.y-25,
                        50,
                        50);

                g2.setColor(Color.BLACK);

                g2.drawOval(
                        p.x-25,
                        p.y-25,
                        50,
                        50);

                g2.drawString(
                        node,
                        p.x-35,
                        p.y-35);
            }
        }
    }
}