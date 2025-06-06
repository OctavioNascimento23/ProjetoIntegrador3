package com.example.projetointegrador3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RisksAdapter(private val risks: List<Risk>) :
    RecyclerView.Adapter<RisksAdapter.RiskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiskViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_risk, parent, false)
        return RiskViewHolder(view)
    }

    override fun onBindViewHolder(holder: RiskViewHolder, position: Int) {
        val risk = risks[position]
        holder.titleTextView.text = risk.titulo
        holder.descriptionTextView.text = risk.descricao
        holder.locationTextView.text = "Lat: ${risk.latitude}, Long: ${risk.longitude}"

        if (risk.imagemUrl != null) {
            Glide.with(holder.itemView.context)
                .load(risk.imagemUrl)
                .into(holder.imageView)
        } else {
            holder.imageView.setImageResource(R.drawable.placeholder_image)
        }
    }

    override fun getItemCount(): Int = risks.size

    class RiskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.riskTitleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.riskDescriptionTextView)
        val locationTextView: TextView = itemView.findViewById(R.id.riskLocationTextView)
        val imageView: ImageView = itemView.findViewById(R.id.riskImageView)
    }
}