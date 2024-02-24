package com.example.myapplication.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.databinding.ItemBinding
import com.example.myapplication.databinding.NewItemBinding
import com.example.myapplication.model.Pizza
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.model.ChildPizza
import com.example.myapplication.model.Combo


class PizzaAdapter(
    private var  PizzaClick: (Pizza) -> Unit,
    private val  ComboClick: (Pizza) -> Unit

): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var ListOfPizza: List<Pizza> = ArrayList()
    private val VIEW_PIZZA = 0
    private val VIEW_COMBO = 1
    fun setData(pizza: List<Pizza>) {
        ListOfPizza = pizza
        /**
         * метод для обновления списка элементов
         */

        notifyDataSetChanged()
    }
    /**
     * метод, который будет создавать view для каждого объекта
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_PIZZA) {
            PizzaViewHolder(
                ItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        } else {
            ComboViewHolder(
                NewItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }




    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pizza = ListOfPizza[position]
        when(holder){
            is PizzaViewHolder -> holder.bind(pizza)
            is ComboViewHolder ->holder.bind(pizza)
        }
    }

    /**
     * метод, для определения количесвта элементов списка
     */
    override fun getItemCount(): Int = ListOfPizza.size

    /**
     * для вызова метода из ViewHolder'a
     */
    override fun getItemViewType(position: Int): Int {
        return if (ListOfPizza[position] is Combo) {
            VIEW_COMBO
        } else {
            VIEW_PIZZA
        }
    }

    inner class PizzaViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

//        init {
//            binding.root.setOnClickListener {
//                val position = adapterPosition
//                if (position != RecyclerView.NO_POSITION) {
//                    val pizza = ListOfPizza[position]
//                    PizzaClick(pizza)
//                }
//            }
//        }
        /// inner class ViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener{
//        val textView: TextView = view.findViewById(R.id.gmrowtextview)
//        init {
//            view.setOnClickListener(this)
//        }
//        override fun onClick(v: View?) {
//            val position = bindingAdapterPosition
//            if (position != RecyclerView.NO_POSITION){
//                listener.onItemClick(position)
//            }
//        }
        fun bind(pizza: Pizza) {
            with(binding) {
                ImageOfPizza.setImageResource(pizza.image)
                title.text = pizza.title
                description.text = pizza.description
                price.text = pizza.price.toString()

                root.setOnClickListener{
                    PizzaClick(pizza)
                }
            }
        }
//        fun bind(movie: Movie) {
//            with(binding) {
//                movieImage.setImageResource(movie.imageRes)
//                movieTitle.text = movie.title
//                movieDescription.text = movie.shortDescription
//                movieRating.text = "${movie.rating}/5"
//                movieGenre.text = movie.genre.first().value
    }
    inner class ComboViewHolder(
        private val binding: NewItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizza) {
            with(binding) {
                NewPizza.setImageResource(pizza.image)
                NewName.text = pizza.title
                NewDescription.text = pizza.description
                NewPrice.text = pizza.price.toString()

                root.setOnClickListener {
                    ComboClick(pizza)
                }


            }
        }
    }
}